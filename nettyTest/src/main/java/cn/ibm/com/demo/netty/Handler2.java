package cn.ibm.com.demo.netty;

public class Handler2 extends AbstractHandler {
    @Override
    void doHandler(HandlerChainContext handlerChainContext, Object arg0) {
        System.out.println("接到指令，开始" + arg0.toString());
        System.out.println("我是工人2，我在处理：烘培月饼...\n");
        // 继续执行下一个handler
        handlerChainContext.findNextContext("冷却月饼...");
    }
}
