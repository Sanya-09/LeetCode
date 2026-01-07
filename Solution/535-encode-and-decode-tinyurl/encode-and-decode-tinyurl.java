public class Codec {

    private Map<String, String> map = new HashMap<>();
    private static final String BASE_URL = "http://tinyurl.com/";
    private static final String CHARSET =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private Random random = new Random();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = generateKey();
        map.put(key, longUrl);
        return BASE_URL + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(BASE_URL, "");
        return map.get(key);
    }

    private String generateKey() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(CHARSET.charAt(random.nextInt(CHARSET.length())));
        }
        return sb.toString();
    }
}
