#RMI#
**RMI**remote method invoke;

##Server##
服务端绑定实体，并发布。
注意声明接口service的时候要抛出 **RemoteException** 异常
serviceImpl的时候要继承 **UnicastRemoteObject** 类，并添加序列号和构造函数
##Client##
Naming.lookup();

##解析##
- 调用者用通常方式调用对应java的一个远程对象的方法
- 客户stub的功能是把相关的参数组装成一个消息包或一组消息包。运行此方法的那个“站点”的地址和对象及方法的“标识符”、调用方法的参数都- 应包含在这条消息中。
- 将这条消息发送给对应的RMI运行时系统，该程序在转至指定的站点。
- 在接受此消息时，远程RMI运行时系统引用与被调用者对应的服务stub，并让它来处理这条消息。
- 服务器stub来反序列化有关参数，并用本地方法调用方式调用所需方法，然后把调用结果序列化，向调用者返回结果。
- 调用方RMI运行时系统棘手返回结果。调用者stub反序列化参数，然后，返回结果到调用方法。


#JNDI#
**JNDI**：java命名和目录接口（Java Naming and Directory Interface）


