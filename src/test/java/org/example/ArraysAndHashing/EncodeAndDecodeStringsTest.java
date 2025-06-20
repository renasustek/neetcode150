package org.example.ArraysAndHashing;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class CodecTest {

    private final EncodeAndDecodeStrings codec = new EncodeAndDecodeStrings();

    @Test
    void testEncodeDecodeBasic() {
        List<String> input = Arrays.asList("neet", "code", "love", "you");
        String encoded = codec.encode(input);
        List<String> decoded = codec.decode(encoded);
        assertEquals(input, decoded);
    }

    @Test
    void testEncodeDecodeWithSpecialCharacters() {
        List<String> input = Arrays.asList("we", "say", ":", "yes");
        String encoded = codec.encode(input);
        List<String> decoded = codec.decode(encoded);
        assertEquals(input, decoded);
    }

    @Test
    void testEncodeDecodeWithEmptyStringsAndEdgeCases() {
        List<String> input = Arrays.asList("", "hello", "", "", "world", "");
        String encoded = codec.encode(input);
        List<String> decoded = codec.decode(encoded);
        assertEquals(input, decoded);

        List<String> emptyList = new ArrayList<>();
        String encodedEmpty = codec.encode(emptyList);
        List<String> decodedEmpty = codec.decode(encodedEmpty);
        assertEquals(emptyList, decodedEmpty);

        List<String> singleEmptyString = Arrays.asList("");
        String encodedSingleEmpty = codec.encode(singleEmptyString);
        List<String> decodedSingleEmpty = codec.decode(encodedSingleEmpty);
        assertEquals(singleEmptyString, decodedSingleEmpty);
    }

    @Test
    void testEncodeDecodeWithVariousSpecialCharacters() {
        List<String> input = Arrays.asList("we", "say", ":", "yes", "!@#$%^&*()");
        String encoded = codec.encode(input);
        List<String> decoded = codec.decode(encoded);
        assertEquals(input, decoded);
    }

}
