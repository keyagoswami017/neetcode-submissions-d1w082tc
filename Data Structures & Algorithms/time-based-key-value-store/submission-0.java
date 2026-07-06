class TimeMap {

    Map <String, TreeMap<Integer,String>> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        hm.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key))
            return "";
        TreeMap<Integer, String> timestamps = hm.get(key);
        Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }
}
