package com.zemoga.services.Twitter;

import java.util.List;

public interface TwitterIntegrationService {
    List<String> getLastTweetsFromUser(String user);
}
