package pastes.storage;

import pastes.entities.Paste;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Storage {
    public static ConcurrentHashMap<Long, Paste> pastes = new ConcurrentHashMap<>();

    private static AtomicLong lastId = new AtomicLong(0);

    public static long getLastId() {
        return lastId.incrementAndGet();
    }

    public static void putPaste(Paste paste) {
        pastes.put(paste.getId(), paste);
    }

    public static Paste getPasteById(Long id) {
        return pastes.get(id);
    }
}