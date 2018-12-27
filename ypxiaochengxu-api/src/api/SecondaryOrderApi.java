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
	 * @api {GET} /secondary/order/orderList  订单列表
	 * @apiName getOrderList
	 * @apiGroup secondary/order
	 * @apiVersion 0.0.1
	 * @apiDescription 订单列表
	 * 
	 * @apiParam {int} orderStatus  
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
	void getOrderList();
	  
    /**
	 * @api {GET} /secondary/order/orderDelete  删除订单
	 * @apiName deleteSecondaryOrder
	 * @apiGroup secondary/order
	 * @apiVersion 0.0.1
	 * @apiDescription 删除订单
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
}
