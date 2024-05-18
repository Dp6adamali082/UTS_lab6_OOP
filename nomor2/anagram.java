import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Menghapus spasi dan mengubah semua huruf menjadi huruf kecil
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Jika panjang kedua string berbeda, mereka tidak mungkin anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        // Menghitung frekuensi setiap karakter dalam str1
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Mengurangi frekuensi berdasarkan karakter dalam str2
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
            if (charCountMap.get(c) == 0) {
                charCountMap.remove(c);
            }
        }

        // Jika map kosong, maka kedua string adalah anagram
        return charCountMap.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));  // Output: true
        System.out.println(areAnagrams("triangle", "integral"));  // Output: true
        System.out.println(areAnagrams("apple", "pale"));  // Output: false
    }
}
