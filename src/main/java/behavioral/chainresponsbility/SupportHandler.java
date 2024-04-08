package behavioral.chainresponsbility;

public interface SupportHandler {
    void handle(Request request);

    void setNextHandler(SupportHandler handler);
}
