package api;
/**
*
* @Type SecondaryApi.java
* @Desc 元培小程序接口文档_校园二手模块
* @author zzc
* @date 2018年12月21日15:40:00
* @Version V1.0
*/
@Deprecated
public interface SecondaryApi {
	/**
	 * @api {get} /secondary/goods/list  得到商品列表
	 * @apiName getSecondaryGoodsList()
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 得到商品列表
	 * 
	 *@apiParam {int} status  状态（0:未审核;1:已通过；2:未通过；3：已被购买 4:下架）
	 * @apiParam {int} pageNo  当前页 
	 * @apiParam {int} pageSize  页面大小
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount 总页数
	 * @apiSuccess {int} recordCount 总记录数
	 * @apiSuccess {object} list
	 * @apiSuccess {int} list.id 
	 * @apiSuccess {long} list.userId 学生id
	 * @apiSuccess {String} list.goodsTitle 商品标题
	 * @apiSuccess {String} list.goodsContent 商品内容
	 * @apiSuccess {String} list.goodsImag 商品图片
	 * @apiSuccess {String} list.postion 地址
	 * @apiSuccess {int} list.goodsType 商品类型
	 * @apiSuccess {int} list.goodsWay 商品售卖形式
	 * @apiSuccess {int} list.tradingWay 商品交易方式
	 * @apiSuccess {int} list.status 商品状态（0:未审核;1:已通过；2:未通过；3：已被购买 4:下架）
	 * @apiSuccess {String} list.telephone 联系方式
	 * @apiSuccess {String} list.views 浏览量
	 * @apiSuccess {BigDecimal} list.price 价格
	 * @apiSuccess {BigDecimal} list.oldPrice 原价
	 * @apiSuccess {String} list.gmtCreated 添加时间
	 * @apiSuccess {String} list.gmtModified 修改时间
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{
	 *    "code": "200",
	 *    "message": "",
	 *    "pageNo": 1,
	 *    "pageSize": 20,
	 *    "pageCount": 1,
	 *    "recordCount": 10,
	 *    "list": [
	 *        {
	 *            "id": 16,
	 *            "userId": 413150238,
	 *            "goodsTitle": "猪年大吉礼包",
	 *            "goodsContent": "猪年大吉新春礼包",
	 *            "goodsImag": "[\"https://www.sxscott.com/crazyBirdimg/secondHand/secondHand_20190210164620002_45169069.jpg\"]",
	 *            "postion": "11幢236寝室",
 	 *           "goodsType": 5,
	 *            "goodsWay": 2,
	 *            "tradingWay": 1,
	 *            "status": 3,
	 *            "telephone": "17857058385",
	 *            "views": 7,
	 *            "price": 0.1,
	 *            "oldPrice": 0.2,
	 *            "gmtCreated": "2019-02-10 16:46:20",
	 *            "gmtModified": "2019-02-10 16:47:25"
	 *        }
	 *    ]
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void getSecondaryGoodsList();
	
	/**
	 * @api {get} /secondary/goods/name  搜索商品
	 * @apiName getSecondaryGoodsListByName()
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription  搜索商品
	 * 
	 *@apiParam {String} goodsName 商品名称
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount 总页数
	 * @apiSuccess {int} recordCount 总记录数
	 * @apiSuccess {object} list
	 * @apiSuccess {int} list.id 
	 * @apiSuccess {long} list.userId 学生id
	 * @apiSuccess {String} list.goodsTitle 商品标题
	 * @apiSuccess {String} list.goodsContent 商品内容
	 * @apiSuccess {String} list.goodsImag 商品图片
	 * @apiSuccess {String} list.postion 地址
	 * @apiSuccess {int} list.goodsType 商品类型
	 * @apiSuccess {int} list.goodsWay 商品售卖形式
	 * @apiSuccess {int} list.tradingWay 商品交易方式
	 * @apiSuccess {int} list.status 商品状态（0:未审核;1:已通过；2:未通过；3：已被购买 4:下架）
	 * @apiSuccess {String} list.telephone 联系方式
	 * @apiSuccess {String} list.views 浏览量
	 * @apiSuccess {BigDecimal} list.price 价格
	 * @apiSuccess {BigDecimal} list.oldPrice 原价
	 * @apiSuccess {String} list.gmtCreated 添加时间
	 * @apiSuccess {String} list.gmtModified 修改时间
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{
	 *    "code": "200",
	 *    "message": "",
	 *    "pageNo": 1,
	 *    "pageSize": 20,
	 *    "pageCount": 1,
	 *    "recordCount": 10,
	 *    "list": [
	 *        {
	 *            "id": 16,
	 *            "userId": 413150238,
	 *            "goodsTitle": "猪年大吉礼包",
	 *            "goodsContent": "猪年大吉新春礼包",
	 *            "goodsImag": "[\"https://www.sxscott.com/crazyBirdimg/secondHand/secondHand_20190210164620002_45169069.jpg\"]",
	 *            "postion": "11幢236寝室",
 	 *           "goodsType": 5,
	 *            "goodsWay": 2,
	 *            "tradingWay": 1,
	 *            "status": 3,
	 *            "telephone": "17857058385",
	 *            "views": 7,
	 *            "price": 0.1,
	 *            "oldPrice": 0.2,
	 *            "gmtCreated": "2019-02-10 16:46:20",
	 *            "gmtModified": "2019-02-10 16:47:25"
	 *        }
	 *    ]
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void getSecondaryGoodsListByName();
	
	/**
	 * @api {get} /secondary/goods/get  得到商品详细信息
	 * @apiName getSecondaryGoods()
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 得到商品详细信息
	 * 
	 *@apiParam {int} id 商品id
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} id 
	 * @apiSuccess {long} userId 学生id
	 * @apiSuccess {String} goodsTitle 商品标题
	 * @apiSuccess {String} goodsContent 商品内容
	 * @apiSuccess {String} goodsImag 商品图片
	 * @apiSuccess {String} postion 地址
	 * @apiSuccess {int} goodsType 商品类型
	 * @apiSuccess {int} goodsWay 商品售卖形式
	 * @apiSuccess {int} tradingWay 商品交易方式
	 * @apiSuccess {int} status 商品状态（0:未审核;1:已通过；2:未通过；3：已被购买 4:下架）
	 * @apiSuccess {String} telephone 联系方式
	 * @apiSuccess {String} views 浏览量
	 * @apiSuccess {BigDecimal} price 价格
	 * @apiSuccess {BigDecimal} oldPrice 原价
	 * @apiSuccess {String} gmtCreated 添加时间
	 * @apiSuccess {String} gmtModified 修改时间
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{

	 *            "id": 16,
	 *            "userId": 413150238,
	 *            "goodsTitle": "猪年大吉礼包",
	 *            "goodsContent": "猪年大吉新春礼包",
	 *            "goodsImag": "[\"https://www.sxscott.com/crazyBirdimg/secondHand/secondHand_20190210164620002_45169069.jpg\"]",
	 *            "postion": "11幢236寝室",
 	 *           "goodsType": 5,
	 *            "goodsWay": 2,
	 *            "tradingWay": 1,
	 *            "status": 3,
	 *            "telephone": "17857058385",
	 *            "views": 7,
	 *            "price": 0.1,
	 *            "oldPrice": 0.2,
	 *            "gmtCreated": "2019-02-10 16:46:20",
	 *            "gmtModified": "2019-02-10 16:47:25"
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void getSecondaryGoods();
	
	/**
	 * @api {put} /secondary/goods/update 修改商品
	 * @apiName updateSecondaryGoods()
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 修改商品
	 * 
	 * @apiParam {int} id 
	 * @apiParam {long} userId 学生id
	 * @apiParam {String} goodsTitle 商品标题
	 * @apiParam {String} goodsContent 商品内容
	 * @apiParam {String} goodsImag 商品图片
	 * @apiParam {String} postion 地址
	 * @apiParam {int} goodsType 商品类型
	 * @apiParam {int} goodsWay 商品售卖形式
	 * @apiParam {int} tradingWay 商品交易方式
	 * @apiParam {int} status 商品状态（0:未审核;1:已通过；2:未通过；3：已被购买 4:下架）
	 * @apiParam {String} telephone 联系方式
	 * @apiParam {String} views 浏览量
	 * @apiParam {BigDecimal} price 价格
	 * @apiParam {BigDecimal} oldPrice 原价
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{
	 *
	 *     "code":"200",
	 *     "message":""
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void updateSecondaryGoods();
	
	/**
	 * @api {post} /secondary/goods/add 添加官方商品
	 * @apiName addSecondaryGoods()
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 添加官方商品
	 * 
	 * @apiParam {int} id 
	 * @apiParam {long} userId 学生id(888888888)
	 * @apiParam {String} goodsTitle 商品标题
	 * @apiParam {String} goodsContent 商品内容
	 * @apiParam {String} goodsImag 商品图片
	 * @apiParam {String} postion 地址
	 * @apiParam {int} goodsType 商品类型(传1)
	 * @apiParam {int} goodsWay 商品售卖形式(传1)
	 * @apiParam {int} tradingWay 商品交易方式
	 * @apiParam {int} status 商品状态（0:未审核;1:已通过；2:未通过；3：已被购买 4:下架）
	 * @apiParam {String} telephone 联系方式
	 * @apiParam {String} views 浏览量
	 * @apiParam {BigDecimal} price 价格
	 * @apiParam {BigDecimal} oldPrice 原价
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{
	 *
	 *     "code":"200",
	 *     "message":""
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void addSecondaryGoods();
	
	/**
	 * @api {delete} /secondary/goods/delete 删除二手商品
	 * @apiName deleteSecondaryGoods()
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 删除二手商品
	 * 
	 * @apiParam {int} id 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{
	 *
	 *     "code":"200",
	 *     "message":""
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void deleteSecondaryGoods();
	
	/**
	 * @api {get} /secondary/order/list   得到订单列表
	 * @apiName getSecondaryOrdeList()
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription  得到订单列表
	 * 
	 *@apiParam {int} status  状态(订单状态0.待付款1.付款成功2.收到货物3.申请退款4.退款成功)
	 * @apiParam {int} pageNo  当前页 
	 * @apiParam {int} pageSize  页面大小
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount 总页数
	 * @apiSuccess {int} recordCount 总记录数
	 * @apiSuccess {object} list
	 * @apiSuccess {long} list.id 
	 * @apiSuccess {String} list.orderId 订单id
	 * @apiSuccess {long} list.goodsId 商品id
	 * @apiSuccess {long} list.userId 买家id
	 * @apiSuccess {BigDecimal} list.price 金额
	 * @apiSuccess {long} list.sellerId 卖家id
	 * @apiSuccess {String} list.seller 卖家名称
	 * @apiSuccess {String} list.consignee 卖家名称
	 * @apiSuccess {int} list.logistics 物流状态（物流状态：0.未发货1.已发货）
	 * @apiSuccess {int} list.orderState 订单状态（订单状态0.待付款1.付款成功2.收到货物3.申请退款4.退款成功）
	 * @apiSuccess {String} list.receivePhone 买家联系方式
	 * @apiSuccess {String} list.receiveAddress 收货地址
	 * @apiSuccess {String} list.gmtCreated 添加时间
	 * @apiSuccess {String} list.gmtModified 修改时间
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{
	 *    "code": "200",
	 *    "message": "",
	 *    "pageNo": 1,
	 *    "pageSize": 20,
	 *    "pageCount": 1,
	 *    "recordCount": 10,
	 *    "list": [
	 *       {
	 *            "id": 94,
 	 *           "orderId": "12019021016471748132671929870419",
	 *            "goodsId": 16,
	 *            "userId": 413150236,
	 *            "price": 0.1,
	 *            "sellerId": 413150238,
	 *            "seller": "Effort🐬",
	 *            "consignee": "哈哈哈",
	 *            "logistics": 1,
 	 *           "orderState": 2,
	 *            "receivePhone": "51587845151",
	 *            "receiveAddress": "不是都还不错你参加粗v家",
	 *            "gmtCreated": "2019-02-10 16:47:17",
	 *            "gmtModified": "2019-02-10 16:53:38"
	 *        }
	 *    ]
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void getSecondaryOrdeList();
	
	/**
	 * @api {get} /secondary/order/get   得到订单详情
	 * @apiName getSecondaryOrder()
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription  得到订单详情
	 * 
	 *@apiParam {String} orderId  订单id
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {long} id 
	 * @apiSuccess {String} orderId 订单id
	 * @apiSuccess {long} goodsId 商品id
	 * @apiSuccess {long} userId 买家id
	 * @apiSuccess {BigDecimal} price 金额
	 * @apiSuccess {long} sellerId 卖家id
	 * @apiSuccess {String} seller 卖家名称
	 * @apiSuccess {String} consignee 卖家名称
	 * @apiSuccess {int} logistics 物流状态（物流状态：0.未发货1.已发货）
	 * @apiSuccess {int} orderState 订单状态（订单状态0.待付款1.付款成功2.收到货物3.申请退款4.退款成功）
	 * @apiSuccess {String} receivePhone 买家联系方式
	 * @apiSuccess {String} receiveAddress 收货地址
	 * @apiSuccess {String} gmtCreated 添加时间
	 * @apiSuccess {String} gmtModified 修改时间
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{
	 *  	      "code": "200",
	 *            "message": "",
	 *            "id": 94,
 	 *           "orderId": "12019021016471748132671929870419",
	 *            "goodsId": 16,
	 *            "userId": 413150236,
	 *            "price": 0.1,
	 *            "sellerId": 413150238,
	 *            "seller": "Effort🐬",
	 *            "consignee": "哈哈哈",
	 *            "logistics": 1,
 	 *           "orderState": 2,
	 *            "receivePhone": "51587845151",
	 *            "receiveAddress": "不是都还不错你参加粗v家",
	 *            "gmtCreated": "2019-02-10 16:47:17",
	 *            "gmtModified": "2019-02-10 16:53:38"
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void getSecondaryOrder();
	
	/**
	 * @api {put} /secondary/order/update   修改订单
	 * @apiName updateSecondaryOrder()
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription  修改订单
	 * 
	 * @apiParam {long} id 
	 * @apiParam {String} orderId 订单id
	 * @apiParam {long} goodsId 商品id
	 * @apiParam {long} userId 买家id
	 * @apiParam {BigDecimal} price 金额
	 * @apiParam {long} sellerId 卖家id
	 * @apiParam {String} seller 卖家名称
	 * @apiParam {String} consignee 卖家名称
	 * @apiParam {int} logistics 物流状态（物流状态：0.未发货1.已发货）
	 * @apiParam {int} orderState 订单状态（订单状态0.待付款1.付款成功2.收到货物3.申请退款4.退款成功）
	 * @apiParam {String} receivePhone 买家联系方式
	 * @apiParam {String} receiveAddress 收货地址
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{
	 *  	      "code": "200",
	 *            "message": "",
	 *          
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void updateSecondaryOrder();
	
	/**
	 * @api {delete} /secondary/order/delete   删除订单
	 * @apiName deletearyOrder()
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription  删除订单
	 * 
	 * @apiParam {String} orderId 订单id
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *	{
	 *  	      "code": "200",
	 *            "message": "",
	 *          
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void deletearyOrder();
	
	  /**
		 * @api {get} /secondary/type  得到商品分类
		 * @apiName getSecondaryType
		 * @apiGroup secondary
		 * @apiVersion 0.0.1
		 * @apiDescription 得到商品分类
		 * 
		 * 
		 * @apiSuccess {String} code 结果码
		 * @apiSuccess {String} message 消息说明
		 * @apiSuccess {object} list
		 * @apiSuccess {int} list.id ID
		 * @apiSuccess {String} list.field 名字
		 * @apiSuccessExample Success-Response:
		 * HTTP/1.1 200
	     *{
	     *"code": "200",
	     *"message": "",
	     *"list": [
	     *   {
	     *       "id": 0,
	     *       "field": "所有"
	     *   },
	     *   {
	     *       "id": 1,
	     *       "field": "手机电脑"
	     *   },
	     *   {
	     *       "id": 2,
	     *       "field": "游戏交易"
	     *   },
	     *   {
	     *       "id": 3,
	     *       "field": "二手车"
	     *   },
	     *   {
	     *       "id": 4,
	     *       "field": "日常生活"
	     *   },
	     *   {
	     *       "id": 5,
	     *       "field": "美妆产品"
	     *   },
	     *   {
	     *       "id": 6,
	     *       "field": "家居家电"
	     *   },
	     *   {
	     *       "id": 7,
	     *       "field": "体育用品"
	     *   },
	     *   {
	     *       "id": 8,
	     *       "field": "课本读物"
	     *   },
	     *   {
	     *       "id": 9,
	     *       "field": "数码产品"
	     *   }
	     *]
	     *}
		 * @apiErrorExample Error-Response:
		 * HTTP/1.1 400
		 * {
		 *     "code":"400",
		 *     "message":""
		 * }
		 * 
		 */
		void getSecondaryType();
		
	    /**
		 * @api {get} /secondary/traydingWay  得到交易方式
		 * @apiName getSecondaryTradingWay
		 * @apiGroup secondary
		 * @apiVersion 0.0.1
		 * @apiDescription 得到交易方式
		 * 
		 * 
		 * @apiSuccess {String} code 结果码
		 * @apiSuccess {String} message 消息说明
		 * @apiSuccess {object} list
		 * @apiSuccess {int} list.id ID
		 * @apiSuccess {String} list.field 名字
		 * @apiSuccessExample Success-Response:
		 * HTTP/1.1 200
	     *{
	     *"code": "200",
	     *"message": "",
	     * "list": [
	     *   {
	     *       "id": 1,
	     *       "field": "自提"
	     *   },
	     *   {
	     *       "id": 2,
	     *       "field": "自送"
	     *   },
	     *   {
	     *       "id": 3,
	     *       "field": "跑腿"
	     *   }
	     * ]
	     *}
		 * @apiErrorExample Error-Response:
		 * HTTP/1.1 400
		 * {
		 *     "code":"400",
		 *     "message":""
		 * }
		 * 
		 */
		void getSecondaryTradingWay();
		
	    /**
		 * @api {get} /secondary/way  得到售卖形式
		 * @apiName getSecondaryWay
		 * @apiGroup secondary
		 * @apiVersion 0.0.1
		 * @apiDescription 得到售卖形式
		 * 
		 * 
		 * @apiSuccess {String} code 结果码
		 * @apiSuccess {String} message 消息说明
		 * @apiSuccess {object} list
		 * @apiSuccess {int} list.id ID
		 * @apiSuccess {String} list.field 名字
		 * @apiSuccessExample Success-Response:
		 * HTTP/1.1 200
	     *{
	     *"code": "200",
	     *"message": "",
	     *"list": [
	     *   {
	     *       "id": 1,
	     *       "field": "寄卖"
	     *   },
	     *   {
	     *       "id": 2,
	     *       "field": "个人"
	     *   }
	     *]
	     *}
		 * @apiErrorExample Error-Response:
		 * HTTP/1.1 400
		 * {
		 *     "code":"400",
		 *     "message":""
		 * }
		 * 
		 */
		void getSecondaryWay();

	    /**
		 * @api {get} /secondary/refund 得到退款详情
		 * @apiName getSecondaryRefund
		 * @apiGroup secondary
		 * @apiVersion 0.0.1
		 * @apiDescription 得到退款详情
		 * 
		 * @apiParam {String} orderId 订单id
		 * @apiSuccess {String} code 结果码
		 * @apiSuccess {String} message 消息说明
		 * @apiSuccess {object} list
		 * @apiSuccess {int} list.id 
		 * @apiSuccess {String} list.orderId 订单id
		 * @apiSuccess {int} list.type 退款类型(1：二手，其他分类暂无)
		 * @apiSuccess {String} list.content 退款理由
		 * @apiSuccess {int} list.state 状态（0：未退款，1：已退款，暂时无用）
		 * @apiSuccess {String} gmtCreated 添加时间
		 * @apiSuccess {String} gmtModified 修改时间
		 * @apiSuccessExample Success-Response:
		 * HTTP/1.1 200
	     *{
	     *"code": "200",
	     *"message": "",
	     *"list": [
	     *        {
	     *            "id": 1,
	     *            "orderId": "12019010913081704752671929880535",
	     *            "type": 1,
	     *            "content": "aaaaaa",
	     *            "state": 0,
	     *            "gmtCreated": "2019-01-24 15:43:28",
	     *            "gmtModified": "2019-01-24 15:43:28"
	     *        }
	     *    ]
	     *}
		 * @apiErrorExample Error-Response:
		 * HTTP/1.1 400
		 * {
		 *     "code":"400",
		 *     "message":""
		 * }
		 * 
		 */
		void getSecondaryRefund();
		
		 /**
		 * @api {post} /crazyBird/secondary/refund 退款(接口写在了用户端)
		 * @apiName SecondaryRefund
		 * @apiGroup secondary
		 * @apiVersion 0.0.1
		 * @apiDescription 退款
		 * 
		 * @apiParam {int} type 退款类型（1：二手，其他暂无）
		 * @apiParam {String} orderId 订单id
		 * @apiParam {double} totalFee 总价
		 * @apiParam {double} refundFee 退款金额
		 * @apiSuccess {String} code 结果码
		 * @apiSuccess {String} message 消息说明
		 * @apiSuccessExample Success-Response:
		 * HTTP/1.1 200
	     *{
	     *"code": "200",
	     *"message": "",
	     *}
		 * @apiErrorExample Error-Response:
		 * HTTP/1.1 400
		 * {
		 *     "code":"400",
		 *     "message":""
		 * }
		 * 
		 */
		void secondaryRefund();
	
}
