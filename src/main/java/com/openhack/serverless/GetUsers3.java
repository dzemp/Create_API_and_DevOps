
package com.openhack.serverless;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetUsers3 {
    @FunctionName("GetUsers3)")
    public void run(@EventGridTrigger(
        name = "event"
      )
      final ExecutionContext context) {
        context.getLogger().info("Event content: " + context);
    }
}
