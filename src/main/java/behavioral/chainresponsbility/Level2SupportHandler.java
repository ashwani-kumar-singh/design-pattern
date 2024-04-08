package behavioral.chainresponsbility;

import java.util.Objects;

public class Level2SupportHandler implements SupportHandler {

    private SupportHandler nextHandler;

    @Override
    public void handle(Request request) {
        if (Priority.INTERMEDIATE.equals(request.getPriority())) {
            System.out.println("Level 2 Support handled the request.");
        } else if (Objects.nonNull(nextHandler)) {
            nextHandler.handle(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }
}
