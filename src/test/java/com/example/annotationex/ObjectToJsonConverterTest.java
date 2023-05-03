package com.example.annotationex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObjectToJsonConverterTest {

    @Test
    public void givenObjectSerializedThenTrueReturned() throws RuntimeException {
        Person person = new Person("soufiane", "cheouati", "34");
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();

        String jsonString = serializer.convertToJson(person);

        assertEquals(
                "{\"personAge\":\"34\",\"firstName\":\"Soufiane\",\"lastName\":\"Cheouati\"}",
                jsonString);
    }

}