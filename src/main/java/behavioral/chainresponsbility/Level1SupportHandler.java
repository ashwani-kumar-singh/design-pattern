package behavioral.chainresponsbility;

import java.util.Objects;

public class Level1SupportHandler implements SupportHandler {

    private SupportHandler nextHandler;
    @Override
    public void handle(Request request) {
        if(Priority.BASIC.equals(request.getPriority())) {
            System.out.println("Level 1 Support handled the request.");
        } else if (Objects.nonNull(nextHandler)){
            nextHandler.handle(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }
}
