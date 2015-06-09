#RMI#
**RMI**remote method invoke;

##Server##
服务端绑定实体，并发布。
注意声明接口service的时候要抛出 **RemoteException** 异常
serviceImpl的时候要继承 **UnicastRemoteObject** 类，并添加序列号和构造函数
##Client##
Naming.lookup();
