package kb.websockets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MessageControllerTrigger
{
    @Autowired
    private MessageController messageController;

    @RequestMapping("/testNotification")
    public void triggerPushNotification() throws Exception{
        messageController.notification();
    }
}
