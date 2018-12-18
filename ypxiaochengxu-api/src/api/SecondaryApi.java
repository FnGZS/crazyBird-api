package api;
/**
*
* @Type SecondaryApi.java
* @Desc 元培小程序接口文档_二手模块
* @author wangbiao
* @date 2018年12月18日17:40:00
* @Version V1.0
*/
@Deprecated
public interface SecondaryApi {
	  
    /**
	 * @api {get} /secondary/slide  得到二手市场首页轮播图
	 * @apiName getSecondarySlide
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 得到二手市场首页轮播图
	 * 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} list
	 * @apiSuccess {int} list.id ID
	 * @apiSuccess {String} list.slideImg 轮播图
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     *"list": [
     *   {
     *       "id": 1,
     *       "slideImg": "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1545113327578&di=ea0897c59dc413dd7690aaab6e956a1d&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F017cd755fad1666ac7251df86d1034.jpg%401280w_1l_2o_100sh.jpg"
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
	void getSecondarySlide();
	
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
	 * @api {get} /secondary/search  搜索
	 * @apiName searchSecondaryGoods
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 搜索
	 * 
	 * @apiParam {String} keyWord  关键字
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {object} list
	 * @apiSuccess {long} list.id ID
	 * @apiSuccess {long} list.userId 用户ID
	 * @apiSuccess {int} list.views 浏览量
	 * @apiSuccess {int} list.goodsNum 商品数量
	 * @apiSuccess {String} list.userName 用户名
	 * @apiSuccess {String} list.headImgUrl 
	 * @apiSuccess {String} list.goodsTitle 商品标题
	 * @apiSuccess {String} list.goodsContent 商品内容
	 * @apiSuccess {String} list.goodsImag 商品图片
	 * @apiSuccess {String} list.postion 位置
	 * @apiSuccess {String} list.goodsType 商品类型
	 * @apiSuccess {String} list.goodsWay 售卖形式
	 * @apiSuccess {String} list.tradingWay 交易方式
	 * @apiSuccess {String} list.price 价格
	 * @apiSuccess {String} list.gmtCreated 发布
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     *"pageNo": 1,
     *"pageSize": 20,
     *"pageCount": 1,
     *"recordCount": 2,
     *"list": [
     *   {
     *       "id": 6,
     *       "userId": 413150238,
     *       "views": 0,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "dsadasd",
     *       "goodsContent": "qweqwdasd",
     *       "goodsImag": "asdasds.jpg",
     *       "postion": "waeasd",
     *       "goodsType": "手机电脑",
     *       "goodsWay": "寄卖",
     *       "tradingWay": "自提",
     *       "price": "222.22",
     *       "gmtCreated": "2018-12-17 23:01:21"
     *   },
     *   {
     *       "id": 5,
     *       "userId": 413150238,
     *       "views": 0,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "dsadasd",
     *       "goodsContent": "qweqwdasd",
     *       "goodsImag": "asdasds.jpg",
     *       "postion": "waeasd",
     *       "goodsType": "手机电脑",
     *       "goodsWay": "寄卖",
     *       "tradingWay": "自提",
     *       "price": "222.22",
     *       "gmtCreated": "2018-12-17 22:59:54"
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
	void searchSecondaryGoods();
	
    /**
	 * @api {get} /secondary/search  得到某分类的商品列表
	 * @apiName getSecondaryGoodsList
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 得到某分类的商品列表
	 * 
	 * @apiParam {String} goodsType  商品类型
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {object} list
	 * @apiSuccess {long} list.id ID
	 * @apiSuccess {long} list.userId 用户ID
	 * @apiSuccess {int} list.views 浏览量
	 * @apiSuccess {int} list.goodsNum 商品数量
	 * @apiSuccess {String} list.userName 用户名
	 * @apiSuccess {String} list.headImgUrl 
	 * @apiSuccess {String} list.goodsTitle 商品标题
	 * @apiSuccess {String} list.goodsContent 商品内容
	 * @apiSuccess {String} list.goodsImag 商品图片
	 * @apiSuccess {String} list.postion 位置
	 * @apiSuccess {String} list.goodsType 商品类型
	 * @apiSuccess {String} list.goodsWay 售卖形式
	 * @apiSuccess {String} list.tradingWay 交易方式
	 * @apiSuccess {String} list.price 价格
	 * @apiSuccess {String} list.gmtCreated 发布
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     *"pageNo": 1,
     *"pageSize": 20,
     *"pageCount": 1,
     *"recordCount": 6,
     *"list": [
     *   {
     *       "id": 6,
     *       "userId": 413150238,
     *       "views": 0,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "dsadasd",
     *       "goodsContent": "qweqwdasd",
     *       "goodsImag": "asdasds.jpg",
     *       "postion": "waeasd",
     *       "goodsType": "手机电脑",
     *       "goodsWay": "寄卖",
     *       "tradingWay": "自提",
     *       "price": "222.22",
     *       "gmtCreated": "2018-12-17 23:01:21"
     *   },
     *   {
     *       "id": 5,
     *       "userId": 413150238,
     *       "views": 0,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "dsadasd",
     *       "goodsContent": "qweqwdasd",
     *       "goodsImag": "asdasds.jpg",
     *       "postion": "waeasd",
     *       "goodsType": "手机电脑",
     *       "goodsWay": "寄卖",
     *       "tradingWay": "自提",
     *       "price": "222.22",
     *       "gmtCreated": "2018-12-17 22:59:54"
     *   },
     *   {
     *       "id": 4,
     *       "userId": 413150238,
     *       "views": 0,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "多了个iphone7，六成新",
     *       "goodsContent": "这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。",
     *       "goodsImag": "1sadasd.jpg",
     *       "postion": "绍兴文理学院元培学校北区11幢",
     *       "goodsType": "日常生活",
     *       "goodsWay": "个人",
     *       "tradingWay": "自提",
     *       "price": "5000.11",
     *       "gmtCreated": "2018-12-17 22:56:07"
     *   },
     *   {
     *       "id": 3,
     *       "userId": 413150238,
     *       "views": 220,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "多了个iphone7，六成新",
     *       "goodsContent": "这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。",
     *       "goodsImag": "1sadasd.jpg",
     *       "postion": "绍兴文理学院元培学校北区11幢",
     *       "goodsType": "游戏交易",
     *       "goodsWay": "个人",
     *       "tradingWay": "自送",
     *       "price": "5000.11",
     *       "gmtCreated": "2018-12-17 22:02:51"
     *   },
     *   {
     *       "id": 2,
     *       "userId": 413150238,
     *       "views": 222,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "多了个iphone7，六成新",
     *       "goodsContent": "这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。",
     *       "goodsImag": "xxx.jpg",
     *       "postion": "绍兴文理学院元培学校北区11幢",
     *       "goodsType": "游戏交易",
     *       "goodsWay": "个人",
     *       "tradingWay": "自送",
     *       "price": "6000.00",
     *       "gmtCreated": "2018-12-15 13:28:03"
     *   },
     *   {
     *       "id": 1,
     *       "userId": 4131502368,
     *       "views": 208,
     *       "goodsNum": 0,
     *       "userName": "",
     *       "headImgUrl": "",
     *       "goodsTitle": "多了个iphone8，七成新",
     *       "goodsContent": "这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。",
     *       "goodsImag": "xxxxx.jpg",
     *       "postion": "绍兴文理学院元培学校北区11幢",
     *       "goodsType": "手机电脑",
     *       "goodsWay": "寄卖",
     *       "tradingWay": "自提",
     *       "price": "6000.00",
     *       "gmtCreated": "2018-12-14 17:18:52"
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
	void getSecondaryGoodsList();
	
    /**
	 * @api {get} /secondary/goods/{id}  得到某个商品详情
	 * @apiName getSecondaryGoods
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 得到某个商品详情
	 * 
	 * @apiParam {Long} id  
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {object} list
	 * @apiSuccess {long} list.id ID
	 * @apiSuccess {long} list.userId 用户ID
	 * @apiSuccess {int} list.views 浏览量
	 * @apiSuccess {int} list.goodsNum 商品数量
	 * @apiSuccess {String} list.userName 用户名
	 * @apiSuccess {String} list.headImgUrl 
	 * @apiSuccess {String} list.goodsTitle 商品标题
	 * @apiSuccess {String} list.goodsContent 商品内容
	 * @apiSuccess {String} list.goodsImag 商品图片
	 * @apiSuccess {String} list.postion 位置
	 * @apiSuccess {String} list.goodsType 商品类型
	 * @apiSuccess {String} list.goodsWay 售卖形式
	 * @apiSuccess {String} list.tradingWay 交易方式
	 * @apiSuccess {String} list.price 价格
	 * @apiSuccess {String} list.gmtCreated 发布
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     *"list": [
     *   {
     *       "id": 1,
     *       "userId": 4131502368,
     *       "views": 209,
     *       "goodsNum": 0,
     *       "userName": "",
     *       "headImgUrl": "",
     *       "goodsTitle": "多了个iphone8，七成新",
     *       "goodsContent": "这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。",
     *       "goodsImag": "xxxxx.jpg",
     *       "postion": "绍兴文理学院元培学校北区11幢",
     *       "goodsType": "手机电脑",
     *       "goodsWay": "寄卖",
     *       "tradingWay": "自提",
     *       "price": "6000.00",
     *       "gmtCreated": "2018-12-14 17:18:52"
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
	void getSecondaryGoods();
	
    /**
	 * @api {get} /secondary/user  我发布的商品
	 * @apiName getSecondaryGoodsByUser
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 我发布的商品
	 * 
	 * @apiParam {Long} id
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小  
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {object} list
	 * @apiSuccess {long} list.id ID
	 * @apiSuccess {long} list.userId 用户ID
	 * @apiSuccess {int} list.views 浏览量
	 * @apiSuccess {int} list.goodsNum 商品数量
	 * @apiSuccess {String} list.userName 用户名
	 * @apiSuccess {String} list.headImgUrl 
	 * @apiSuccess {String} list.goodsTitle 商品标题
	 * @apiSuccess {String} list.goodsContent 商品内容
	 * @apiSuccess {String} list.goodsImag 商品图片
	 * @apiSuccess {String} list.postion 位置
	 * @apiSuccess {String} list.goodsType 商品类型
	 * @apiSuccess {String} list.goodsWay 售卖形式
	 * @apiSuccess {String} list.tradingWay 交易方式
	 * @apiSuccess {String} list.price 价格
	 * @apiSuccess {String} list.gmtCreated 发布
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     *"pageNo": 1,
     *"pageSize": 20,
     *"pageCount": 1,
     *"recordCount": 5,
     *"list": [
     *   {
     *       "id": 6,
     *       "userId": 413150238,
     *       "views": 0,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "dsadasd",
     *       "goodsContent": "qweqwdasd",
     *       "goodsImag": "asdasds.jpg",
     *       "postion": "waeasd",
     *       "goodsType": "手机电脑",
     *       "goodsWay": "寄卖",
     *       "tradingWay": "自提",
     *       "price": "222.22",
     *       "gmtCreated": "2018-12-17 23:01:21"
     *   },
     *   {
     *       "id": 5,
     *       "userId": 413150238,
     *       "views": 0,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "dsadasd",
     *       "goodsContent": "qweqwdasd",
     *       "goodsImag": "asdasds.jpg",
     *       "postion": "waeasd",
     *       "goodsType": "手机电脑",
     *       "goodsWay": "寄卖",
     *       "tradingWay": "自提",
     *       "price": "222.22",
     *       "gmtCreated": "2018-12-17 22:59:54"
     *   },
     *   {
     *       "id": 4,
     *       "userId": 413150238,
     *       "views": 0,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "多了个iphone7，六成新",
     *       "goodsContent": "这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。",
     *       "goodsImag": "1sadasd.jpg",
     *       "postion": "绍兴文理学院元培学校北区11幢",
     *       "goodsType": "日常生活",
     *       "goodsWay": "个人",
     *       "tradingWay": "自提",
     *       "price": "5000.11",
     *       "gmtCreated": "2018-12-17 22:56:07"
     *   },
     *   {
     *       "id": 3,
     *       "userId": 413150238,
     *       "views": 220,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "多了个iphone7，六成新",
     *       "goodsContent": "这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。",
     *       "goodsImag": "1sadasd.jpg",
     *       "postion": "绍兴文理学院元培学校北区11幢",
     *       "goodsType": "游戏交易",
     *       "goodsWay": "个人",
     *       "tradingWay": "自送",
     *       "price": "5000.11",
     *       "gmtCreated": "2018-12-17 22:02:51"
     *   },
     *   {
     *       "id": 2,
     *       "userId": 413150238,
     *       "views": 222,
     *       "goodsNum": 0,
     *       "userName": "我是智障",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/8uEic61hdA3Wsh7bokxOVfGicTXbEOpMQqj2BnSCicxCUsY0NiadjjJw1JR4PFPWE1en3k8icP7elibLOrOX1mqdOBnw/132",
     *       "goodsTitle": "多了个iphone7，六成新",
     *       "goodsContent": "这个iphone8当初八千入手，现在低价卖出，可提供三包证明，七成新。",
     *       "goodsImag": "xxx.jpg",
     *       "postion": "绍兴文理学院元培学校北区11幢",
     *       "goodsType": "游戏交易",
     *       "goodsWay": "个人",
     *       "tradingWay": "自送",
     *       "price": "6000.00",
     *       "gmtCreated": "2018-12-15 13:28:03"
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
	void getSecondaryGoodsByUser();
	
    /**
	 * @api {get} /secondary/create  发布二手商品
	 * @apiName createSecondaryGoods
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 发布二手商品
	 * 
	 * @apiParam {Long} userId
	 * @apiSuccess {String} goodsTitle 商品标题
	 * @apiSuccess {String} goodsContent 商品内容
	 * @apiSuccess {String} goodsImag 商品图片
	 * @apiSuccess {String} postion 位置
	 * @apiParam {int} goodsType  商品类型
	 * @apiParam {int} goodsWay  售卖形式
	 * @apiParam {int} tradingWay 交易方式
	 * @apiParam {BigDecimal} price 价格
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "发布成功"
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void createSecondaryGoods();
}
