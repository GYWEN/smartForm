package future;

/**
 * 客户端，立即返回Data对象，
 *
 * 具体做法是：会创建一个FutureData实例，在这个实例中，会有一个字段RealData,而这个
 * 值最终的返回会在开启的线程内将FutureData的RealData进行设置值，以供后续的调用。
 */
public class Client {

    //1.创建一个FutureData实例
    //2.执行任务，带着这个Future实例
    //3.会在任务的执行最后为FutureData赋值
}
