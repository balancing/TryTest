/**   
* @Title: ExecuteStatus.java 
* @Package com.jinzhi.entity 
* @author zhong.gaobo   
* @date 2014年8月12日 下午3:51:19 
* @version V1.0   
*/


/** 
 * @ClassName: ExecuteStatus 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author zhong.gaobo 
 * @date 2014年8月12日 下午3:51:19 
 *  //  出入金受理状态
  enum EXECUTE_STATUS
  {
  	EXECUTE_STATUS_KNOWN = '0',			//已接受
   	EXECUTE_STATUS_SUCUSESS ='1',		//支付完成(已处理成功)
 	EXECUTE_STATUS_FAILED = '2',		//系统拒绝
	EXECUTE_STATUS_HAVE_AUDIT ='3',		//已审核
	EXECUTE_STATUS_ON_TRANS = '4',		//正报
  	EXECUTE_STATUS_TRANSED = '5',		//已报
	EXECUTE_STATUS_OTHERS = '6'			//其他
  };

 */
public enum TestExecuteStatus {
	/**
	 * 已接受
	 */
	EXECUTE_STATUS_KNOWN,
	/**
	 * 支付完成(已处理成功)
	 */
   	EXECUTE_STATUS_SUCUSESS,
   	/**
   	 * 系统拒绝
   	 */
 	EXECUTE_STATUS_FAILED,
 	/**
 	 * 已审核
 	 */
	EXECUTE_STATUS_HAVE_AUDIT,
	/**
	 * 正报
	 */
	EXECUTE_STATUS_ON_TRANS,
	/**
	 * 已报
	 */
  	EXECUTE_STATUS_TRANSED,
  	/**
  	 * 其他
  	 */
	EXECUTE_STATUS_OTHERS,;	
	
	public final byte[] toByte(){
		switch(this){
			case EXECUTE_STATUS_KNOWN:
				return new byte[]{0x30,0x00,0x00,0x00};
			case EXECUTE_STATUS_SUCUSESS:
				return new byte[]{0x31,0x00,0x00,0x00};
			case EXECUTE_STATUS_FAILED:
				return new byte[]{0x32,0x00,0x00,0x00};
			case EXECUTE_STATUS_HAVE_AUDIT:
				return new byte[]{0x33,0x00,0x00,0x00};
			case EXECUTE_STATUS_ON_TRANS:
				return new byte[]{0x34,0x00,0x00,0x00};
			case EXECUTE_STATUS_TRANSED:
				return new byte[]{0x35,0x00,0x00,0x00};
			default:
				return new byte[]{0x36,0x00,0x00,0x00};
		}
	}
	
	public final static TestExecuteStatus valueOf(byte ch){
		switch(ch){
			case 0x30:
				return EXECUTE_STATUS_KNOWN;
			case 0x31:
				return EXECUTE_STATUS_SUCUSESS;
			case 0x32:
				return EXECUTE_STATUS_FAILED;
			case 0x33:
				return EXECUTE_STATUS_HAVE_AUDIT;
			case 0x34:
				return EXECUTE_STATUS_ON_TRANS;
			case 0x35:
				return EXECUTE_STATUS_TRANSED;
			default:
				return EXECUTE_STATUS_OTHERS;
		}
	}

	@Override
	public String toString() {
		switch(this){
			case EXECUTE_STATUS_KNOWN:
				return "EXECUTE_STATUS_KNOWN";
			case EXECUTE_STATUS_SUCUSESS:
				return "EXECUTE_STATUS_SUCUSESS";
			case EXECUTE_STATUS_FAILED:
				return "EXECUTE_STATUS_FAILED";
			case EXECUTE_STATUS_HAVE_AUDIT:
				return "EXECUTE_STATUS_HAVE_AUDIT";
			case EXECUTE_STATUS_ON_TRANS:
				return "EXECUTE_STATUS_ON_TRANS";
			case EXECUTE_STATUS_TRANSED:
				return "EXECUTE_STATUS_TRANSED";
			default:
				return "EXECUTE_STATUS_OTHERS";
		}
	}
}
