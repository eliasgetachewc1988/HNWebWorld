package com.example.king.hnwebworld.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();



    static {
        // Add some sample items.
        addItem(new DummyItem("1","Home","https://www.hnwebworld.com/"));
        addItem(new DummyItem("2","Categories","https://www.hnwebworld.com/"));
        addItem(new DummyItem("3","RSS Feed","https://www.hnwebworld.com/"));
        addItem(new DummyItem("4","Rewards Program","https://www.hnwebworld.com/p/earn-rewards.html"));
        addItem(new DummyItem("5","Privacy Policy","https://www.hnwebworld.com/p/privacy-policy.html"));
        addItem(new DummyItem("6","Contact","https://www.hnwebworld.com/p/contact-us.html"));
        addItem(new DummyItem("7","About","https://www.hnwebworld.com/p/about.html"));

    }
    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
