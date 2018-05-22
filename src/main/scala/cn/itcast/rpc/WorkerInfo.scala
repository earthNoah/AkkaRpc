package cn.itcast.rpc

/**
  * Created by Jack Wtf on 20180522.
  */
class WorkerInfo(val id: String, val memory: Int, val cores: Int) {

  //TODO 上一次心跳
  var lastHeartbeatTime : Long = _
}
