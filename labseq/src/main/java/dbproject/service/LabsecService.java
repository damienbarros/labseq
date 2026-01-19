package dbproject.service;

import jakarta.enterprise.context.ApplicationScoped;

import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ApplicationScoped
public class LabsecService {

    private final Map<Integer, BigInteger> cache = new ConcurrentHashMap<>();

    public LabsecService() {
        cache.put(0, BigInteger.ZERO);
        cache.put(1, BigInteger.ONE);
        cache.put(2, BigInteger.ZERO);
        cache.put(3, BigInteger.ONE);
    }

    public BigInteger calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("number must be non-negative");
        }

        synchronized (this) {
            for (int i = 4; i <= n; i++) {
                cache.computeIfAbsent(i,
                        k -> cache.get(k-4).add(cache.get(k-3)));
            }
        }

        return cache.get(n);
    }

}
