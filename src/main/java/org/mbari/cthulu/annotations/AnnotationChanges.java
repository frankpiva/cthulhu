package org.mbari.cthulu.annotations;

import org.mbari.cthulu.model.Annotation;

import java.util.List;
import java.util.UUID;

import static com.google.common.base.MoreObjects.toStringHelper;

final class AnnotationChanges {

    private final List<Annotation> adds;

    private final List<UUID> removes;

    AnnotationChanges(List<Annotation> adds, List<UUID> removes) {
        this.adds = adds;
        this.removes = removes;
    }

    List<Annotation> adds() {
        return adds;
    }

    List<UUID> removes() {
        return removes;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
            .add("adds", adds)
            .add("removes", removes)
            .toString();
    }
}
