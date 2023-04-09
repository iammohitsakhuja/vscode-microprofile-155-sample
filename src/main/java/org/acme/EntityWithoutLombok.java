package org.acme;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public abstract class EntityWithoutLombok implements Serializable {
    private static final long serialVersionUID = 1L;

    private Instant createdAt;

    private Instant updatedAt;
}
