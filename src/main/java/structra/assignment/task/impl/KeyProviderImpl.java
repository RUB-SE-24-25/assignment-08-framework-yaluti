package structra.assignment.task.impl;

import structra.assignment.framework.llm.KeyProvider;

public class KeyProviderImpl implements KeyProvider {
    // stored api key
    private static final String apiKey = "structra-1343abnc-dGhpcyBpcyBub3Qgb3VyIGFwaSBrZXksIG5pY2UgdHJ5IHRobyA6KQ==";

    @Override
    public String getApiKey() {
        // retrieve and decrypt the stored api key
        if (apiKey != null) {
            return apiKey;
        } else {
            // throw an exception if the api key is not found
            throw new RuntimeException("API key not found");
        }
    }
}
