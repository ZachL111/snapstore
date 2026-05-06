package io.portfolio;

public final class DomainReview {
    public record Item(int signal, int slack, int drag, int confidence) {}

    private DomainReview() {}

    public static int score(Item item) {
        return item.signal() * 2 + item.slack() + item.confidence() - item.drag() * 3;
    }

    public static String lane(Item item) {
        int score = score(item);
        if (score >= 140) return "ship";
        if (score >= 105) return "watch";
        return "hold";
    }
}
