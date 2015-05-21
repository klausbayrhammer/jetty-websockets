package kb.websockets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController
{
    @Autowired
    private SimpMessagingTemplate template;

    @MessageMapping("/notification")
    public void notification() throws Exception {
        template.convertAndSend("/topic/message", "Test websocket response");
    }
}
