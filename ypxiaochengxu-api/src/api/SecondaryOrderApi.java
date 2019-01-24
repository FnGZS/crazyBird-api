package api;
/**
*
* @Type SecondaryOrderApi.java
* @Desc 元培小程序接口文档_二手订单模块
* @author wangbiao
* @date 2018年12月22日14:50:00
* @Version V1.0
*/
@Deprecated
public interface SecondaryOrderApi {
	  
    /**
	 * @api {POST} /secondary/order/create  创造订单
	 * @apiName getCreateOrder
	 * @apiGroup secondary/order
	 * @apiVersion 0.0.1
	 * @apiDescription 创造订单
	 * 
	 * @apiParam {Long} goodsId  商品Id
	 * @apiParam {BigDecimal} price  价格
	 * @apiParam {String} consignee  收货人
	 * @apiParam {String} receivePhone收货人电话
	 * @apiParam {String} receiveAddress 收货人地址
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} orderInfo
	 * @apiSuccess {String} orderInfo.appId 
	 * @apiSuccess {String} orderInfo.timeStamp 时间戳
	 * @apiSuccess {String} orderInfo.nonceStr
	 * @apiSuccess {String} orderInfo.pkg
	 * @apiSuccess {String} orderInfo.signType
	 * @apiSuccess {String} orderInfo.paySign
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "下单成功",
	 *    "orderInfo": null
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void getSecondarySlide();
	  
    /**
	 * @api {GET} /secondary/order/orderList  订单列表(买方)
	 * @apiName secondaryOrderList
	 * @apiGroup secondary/order
	 * @apiVersion 0.0.1
	 * @apiDescription 订单列表(买方)
	 * 
	 * @apiParam {int} orderStatus  (0:待付款，1：待发货，2：待收货，不传参数为全部订单)
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {object} tags
	 * @apiSuccess {Long} tags.id
	 * @apiSuccess {Long} tags.userId 用户id
	 * @apiSuccess {int} tags.views 姓名
	 * @apiSuccess {int} tags.goodsNum 电话 
	 * @apiSuccess {String} tags.userName 名字
	 * @apiSuccess {String} tags.headImgUrl
	 * @apiSuccess {String} tags.goodsTitle 商品标题
	 * @apiSuccess {String} tags.goodsContent 商品内容
	 * @apiSuccess {String} tags.goodsImg 商品图片
	 * @apiSuccess {String} tags.postion
	 * @apiSuccess {String} tags.goodsType 商品类型
	 * @apiSuccess {String} tags.goodsWay 售卖形式
	 * @apiSuccess {String} tags.tradingWay 交易方式
	 * @apiSuccess {String} tags.price 商品价格
	 * @apiSuccess {String} tags.oldPrice 原价
	 * @apiSuccess {String} tags.orderId 订单编号
	 * @apiSuccess {String} tags.goodsId 商品id
	 * @apiSuccess {int} tags.orderState 订单状态0.待付款1.付款成功2.收到货物3.申请退款4.退款成功
	 * @apiSuccess {int} tags.logistics 物流状态：0.未发货1.已发货
	 * @apiSuccess {String} tags.sellerId 卖家id
	 * @apiSuccess {String} tags.seller 卖家
	 * @apiSuccess {String} tags.consignee 收货人
	 * @apiSuccess {String} tags.receivePhone 收货人电话
	 * @apiSuccess {String} tags.receiveAddress 收货人地址
	 * @apiSuccess {String} tags.gmtCreated
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "",
	 *    "pageNo": 1,
	 *    "pageSize": 20,
	 *    "pageCount": 0,
	 *    "recordCount": 0,
	 *    "tags": []
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void secondaryOrderList();
	
	/**
	 * @api {GET} /secondary/order/vendorOrderList  订单列表(卖方)
	 * @apiName vendorOrderList
	 * @apiGroup secondary/order
	 * @apiVersion 0.0.1
	 * @apiDescription 订单列表(卖方)
	 * 
	 * @apiParam {int} orderStatus  (0:未发货，1：已发货 不传参数为全部订单)
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {object} tags
	 * @apiSuccess {Long} tags.id
	 * @apiSuccess {Long} tags.userId 用户id
	 * @apiSuccess {int} tags.views 姓名
	 * @apiSuccess {int} tags.goodsNum 电话 
	 * @apiSuccess {String} tags.userName 名字
	 * @apiSuccess {String} tags.headImgUrl
	 * @apiSuccess {String} tags.goodsTitle 商品标题
	 * @apiSuccess {String} tags.goodsContent 商品内容
	 * @apiSuccess {String} tags.goodsImg 商品图片
	 * @apiSuccess {String} tags.postion
	 * @apiSuccess {String} tags.goodsType 商品类型
	 * @apiSuccess {String} tags.goodsWay 售卖形式
	 * @apiSuccess {String} tags.tradingWay 交易方式
	 * @apiSuccess {String} tags.price 商品价格
	 * @apiSuccess {String} tags.oldPrice 原价
	 * @apiSuccess {String} tags.orderId 订单编号
	 * @apiSuccess {String} tags.goodsId 商品id
	 * @apiSuccess {int} tags.orderState 订单状态0.待付款1.付款成功2.收到货物3.申请退款4.退款成功
	 * @apiSuccess {int} tags.logistics 物流状态：0.未发货1.已发货
	 * @apiSuccess {String} tags.sellerId 卖家id
	 * @apiSuccess {String} tags.seller 卖家
	 * @apiSuccess {String} tags.consignee 收货人
	 * @apiSuccess {String} tags.receivePhone 收货人电话
	 * @apiSuccess {String} tags.receiveAddress 收货人地址
	 * @apiSuccess {String} tags.gmtCreated
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "",
	 *    "pageNo": 1,
	 *    "pageSize": 20,
	 *    "pageCount": 0,
	 *    "recordCount": 0,
	 *    "tags": []
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void vendorOrderList();
	
	/**
	 * @api {GET} /secondary/order/orderDetails   订单详情
	 * @apiName vendorOrderList
	 * @apiGroup secondary/order
	 * @apiVersion 0.0.1
	 * @apiDescription 订单详情
	 * 
	 * @apiParam {String} orderId 订单id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} id
	 * @apiSuccess {Long} userId 用户id
	 * @apiSuccess {int} views 查看量
	 * @apiSuccess {int} goodsNum 数量(暂时没有用) 
	 * @apiSuccess {String} userName 名字
	 * @apiSuccess {String} telephone 联系方式
	 * @apiSuccess {String} headImgUrl
	 * @apiSuccess {String} goodsTitle 商品标题
	 * @apiSuccess {String} goodsContent 商品内容
	 * @apiSuccess {String} goodsImg 商品图片
	 * @apiSuccess {String} postion
	 * @apiSuccess {String} goodsType 商品类型
	 * @apiSuccess {String} goodsWay 售卖形式
	 * @apiSuccess {String} tradingWay 交易方式
	 * @apiSuccess {String} price 商品价格
	 * @apiSuccess {String} oldPrice 原价
	 * @apiSuccess {String} orderId 订单编号
	 * @apiSuccess {String} goodsId 商品id
	 * @apiSuccess {int} orderState 订单状态0.待付款1.付款成功2.收到货物3.申请退款4.退款成功
	 * @apiSuccess {int} logistics 物流状态：0.未发货1.已发货
	 * @apiSuccess {String} sellerId 卖家id
	 * @apiSuccess {String} seller 卖家
	 * @apiSuccess {String} consignee 收货人
	 * @apiSuccess {String} receivePhone 收货人电话
	 * @apiSuccess {String} receiveAddress 收货人地址
	 * @apiSuccess {String} gmtCreated
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "",
     *       "id": 1,
     *       "userId": 413150238,
     *       "views": 1119,
     *       "goodsNum": 0,
     *       "userName": "Effort🐬",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/xF183KBwd3dN4mQk483ZNr8vUu94nGibhqmHghSKrEw7Gcr4rpKErFGrCbnNmSoj2v4icnmmEWKmPKTFmppELpVQ/132",
     *       "goodsTitle": "黑蛇黑寡妇蜘蛛X 经济版87键 悬浮式机械键盘。（雷蛇）黑蛇黑寡妇蜘蛛X 经济版87键 悬浮式机械键盘。（雷蛇）",
     *       "goodsContent": "雷蛇黑寡妇蜘蛛x 竞技版87键 悬浮式机械键盘 悬浮式机械键盘\r\n本次交易仅支持自提、当面交易、邮寄雷蛇黑寡妇蜘蛛x 竞技版87键 悬浮式机械键盘 悬浮式机械键盘\r\n",
     *       "goodsImg": "[\"https://www.sxscott.com/crazyBirdimg/affairs/affairs15.png\"]",
     *       "postion": "元培创新创业学院125室",
     *       "goodsType": "官方商品",
     *       "goodsWay": "官方自营",
     *       "tradingWay": "自提",
     *       "price": "6000.00",
     *       "oldPrice": "8000.00",
     *       "orderId": "12019011417422807452671929852069",
     *       "goodsId": 1,
     *       "sellerId": 413150238,
     *       "seller": "Effort🐬",
     *       "consignee": "钟佳闱",
     *       "orderState": 0,
     *       "logistics": 0,
     *       "receivePhone": "18868313425",
     *       "receiveAddress": "北区11幢236寝室",
     *       "gmtCreated": "2019-01-14 17:42:28"
     *  
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void orderDetails();
	  
    /**
	 * @api {GET} /secondary/order/orderDelete  删除订单（暂时无用）
	 * @apiName deleteSecondaryOrder
	 * @apiGroup secondary/order
	 * @apiVersion 0.0.1
	 * @apiDescription 删除订单（暂时无用）
	 * 
	 * @apiParam {long} id 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "删除成功"
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	
	void deleteSecondaryOrder();
	
	 /**
		 * @api {delete} /secondary/order/orderCancel  取消订单
		 * @apiName cancelSecondaryOrder
		 * @apiGroup secondary/order
		 * @apiVersion 0.0.1
		 * @apiDescription 取消订单
		 * 
		 * @apiParam {String} id 
		 * 
		 * @apiSuccess {String} code 结果码
		 * @apiSuccess {String} message 消息说明
		 * @apiSuccessExample Success-Response:
		 * HTTP/1.1 200
		 *{
		 *    "code": "200",
		 *    "message": "取消成功"
		 *}
		 * @apiErrorExample Error-Response:
		 * HTTP/1.1 400
		 * {
		 *     "code":"400",
		 *     "message":""
		 * }
		 * 
		 */
		
	void cancelSecondaryOrder();
		/**
		 * @api {put} /secondary/order/orderAccept  确认收货
		 * @apiName updateSecondaryOrderAccept
		 * @apiGroup secondary/order
		 * @apiVersion 0.0.1
		 * @apiDescription 确认收货
		 * 
		 * @apiParam {String} orderId 订单id 
		 * 
		 * @apiSuccess {String} code 结果码
		 * @apiSuccess {String} message 消息说明
		 * @apiSuccessExample Success-Response:
		 * HTTP/1.1 200
		 *{
		 *    "code": "200",
		 *    "message": "取消成功"
		 *}
		 * @apiErrorExample Error-Response:
		 * HTTP/1.1 400
		 * {
		 *     "code":"400",
		 *     "message":""
		 * }
		 * 
		 */
		
	void updateSecondaryOrderAccept();
	
	/**
	 * @api {put} /secondary/order/orderDelivery  确认发货
	 * @apiName updateSecondaryOrderDelivery
	 * @apiGroup secondary/order
	 * @apiVersion 0.0.1
	 * @apiDescription 确认发货
	 * 
	 * @apiParam {String} orderId 订单id 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "取消成功"
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	
	void updateSecondaryOrderDelivery();

	/**
	 * @api {put} /secondary/order/orderApply  申请退款
	 * @apiName updateSecondaryOrderApplyRefund
	 * @apiGroup secondary/order
	 * @apiVersion 0.0.1
	 * @apiDescription 申请退款
	 * 
	 * @apiParam {String} orderId 订单id 
	 * @apiParam {String} content 理由原因
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "退款成功"
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	
	void updateSecondaryOrderApplyRefund();	
}
