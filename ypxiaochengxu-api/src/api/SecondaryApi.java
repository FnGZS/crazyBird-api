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
	 * @api {get} /secondary/list  得到某分类的商品列表
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
	 * @api {post} /secondary/create  发布二手商品
	 * @apiName createSecondaryGoods
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 发布二手商品
	 * 
	 * @apiParam {Long} userId
	 * @apiParam {String} goodsTitle 商品标题
	 * @apiParam {String} goodsContent 商品内容
	 * @apiParam {String} goodsImag 商品图片
	 * @apiParam {String} postion 位置
	 * @apiParam {String} telephone 联系方式
	 * @apiParam {int} goodsType  商品类型
	 * @apiParam {int} goodsWay  售卖形式
	 * @apiParam {int} tradingWay 交易方式
	 * @apiParam {BigDecimal} price 价格
	 * @apiParam {BigDecimal} oldPrice 原价
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
	
    /**
	 * @api {GET} /secondary/comments  得到对应商品的评论回复
	 * @apiName getSecondaryGoodsComments
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 得到对应商品的评论回复
	 * 
	 * @apiParam {Long} Id
	 * @apiParam {Long} userId
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {int} commentsNum 父评论数
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     *"pageNo": 1,
     *"pageSize": 20,
     *"pageCount": 1,
     *"recordCount": 19,
     *"commentsNum": 39,
     *"list": [
     *   {
     *       "id": 48,
     *       "schoolNum": 413150235,
     *       "content": "dddd",
     *       "gmtCreated": "2018-12-20 14:38:07",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/IsQaADpVic2dp2icVwMfFByQrxwulcNdFYU2iaibYoJibCHAFayISjm6Hl74rUxMVdl0PdQhOeziaKptUZSB0yINhaVw/132",
     *       "commentName": "Zhao、JW🐬",
     *       "items": [
     *           {
     *               "schoolNum": 413150236,
     *               "content": "sb",
     *              "gmtCreated": "2018-12-20 14:38:23",
     *               "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/ibUdM5jBGXtEfeCjHrlFYufDyOIRnPIib3Q3lmyVN3EJTZ8c6yuFw6icI2rm0yWJQCoAr1xmHjaWEyCEZyiceQuKJw/132",
     *               "replyName": "三好学生等等🍀",
     *               "replyedName": "Zhao、JW🐬"
     *           }
     *       ]
     *   },
     *   {
     *       "id": 45,
     *       "schoolNum": 413150238,
     *       "content": "不知道",
     *       "gmtCreated": "2018-12-20 14:33:13",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/xF183KBwd3dN4mQk483ZNr8vUu94nGibhqmHghSKrEw7Gcr4rpKErFGrCbnNmSoj2v4icnmmEWKmPKTFmppELpVQ/132",
     *       "commentName": "Effort🐬",
     *       "items": []
     *   },
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
	void getSecondaryGoodsComments();
	
    /**
	 * @api {GET} /secondary/commentMessage  获取用户未读的评论回复
	 * @apiName getCommentMessage
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 获取用户未读的评论回复
	 * 
	 * @apiParam {Long} userId
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
	 * @apiSuccess {Long} list.id
	 * @apiSuccess {Long} list.goodsId 商品id
	 * @apiSuccess {String} list.content 评论或回复内容
	 * @apiSuccess {String} list.gmtCreated 
	 * @apiSuccess {String} list.headImgUrl
	 * @apiSuccess {String} list.replyName
	 * @apiSuccess {int} list.isView
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     *"pageNo": 1,
     *"pageSize": 20,
     *"pageCount": 1,
     *"recordCount": 12,
     *"list": [
     *   {
     *       "id": 57,
     *       "goodsId": 5,
     *       "content": "吧啦",
     *       "gmtCreated": "2018-12-21 09:48:28",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/xF183KBwd3dN4mQk483ZNr8vUu94nGibhqmHghSKrEw7Gcr4rpKErFGrCbnNmSoj2v4icnmmEWKmPKTFmppELpVQ/132",
     *       "replyName": "Effort🐬",
     *       "isView": 0
     *   },
     *   {
     *       "id": 53,
     *       "goodsId": 1,
     *       "content": "你哪位",
     *       "gmtCreated": "2018-12-20 22:03:23",
     *       "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/xF183KBwd3dN4mQk483ZNr8vUu94nGibhqmHghSKrEw7Gcr4rpKErFGrCbnNmSoj2v4icnmmEWKmPKTFmppELpVQ/132",
     *       "replyName": "Effort🐬",
     *       "isView": 1
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
	void getCommentMessage();
	
    /**
	 * @api {GET} /secondary/message/{id}  获取用户未读信息的数量
	 * @apiName getSecondaryGoodsCommentsCount
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 获取用户未读信息的数量
	 * 
	 * @apiParam {Long} id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} sum
	 * @apiSuccess {object} list
	 * @apiSuccess {int} list.num
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     *"sum": 2,
     *"list": [
     *   {
     *       "num": 2
     *   },
     *   {
     *       "num": 0
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
	void getSecondaryGoodsCommentsCount();
	
    /**
	 * @api {POST} /secondary/comment  评论
	 * @apiName createSecondaryGoodsComment
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 评论
	 * 
	 * @apiParam {Long} id
	 * @apiParam {Long} goodsId 商品id
	 * @apiParam {Long} userId 回复人学号
	 * @apiParam {String} content 评论或回复内容
	 * @apiParam {Long} replyedId 被回复人学号
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": ""
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void createSecondaryGoodsComment();
	
    /**
	 * @api {POST} /secondary/reply  回复
	 * @apiName createSecondaryGoodsReply
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 回复
	 * 
	 * @apiParam {Long} id
	 * @apiParam {Long} goodsId 商品id
	 * @apiParam {Long} userId 回复人学号
	 * @apiParam {String} content 评论或回复内容
	 * @apiParam {Long} replyedId 被回复人学号
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": ""
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void createSecondaryGoodsReply();
	
    /**
	 * @api {GET} /secondary/userAddress/{id}  得到用户地址列表
	 * @apiName getUserAddress
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 得到用户地址列表
	 * 
	 * @apiParam {Long} id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} list
	 * @apiSuccess {Long} list.id
	 * @apiSuccess {Long} list.userId 用户id
	 * @apiSuccess {String} list.name 姓名
	 * @apiSuccess {String} list.telephone 电话 
	 * @apiSuccess {String} list.address 地址
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": "",
     * "list": []
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void getUserAddress();
	
    /**
	 * @api {PUT} /secondary/userAddress/update  修改用户地址
	 * @apiName updatetUserAddress
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 修改用户地址
	 * 
	 * @apiParam {Long} id
	 * @apiParam {Long} userId 用户id
	 * @apiParam {String} name 姓名
	 * @apiParam {String} telephone 电话 
	 * @apiParam {String} address 地址
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": ""
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void updatetUserAddress();
	
    /**
	 * @api {POST} /secondary/userAddress/add  添加用户地址
	 * @apiName addUserAddress
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 添加用户地址
	 * 
	 * @apiParam {Long} id
	 * @apiParam {Long} userId 用户id
	 * @apiParam {String} name 姓名
	 * @apiParam {String} telephone 电话 
	 * @apiParam {String} address 地址
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *"code": "200",
     *"message": ""
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void addUserAddress();
	
    /**
	 * @api {GET} /secondary/sellList  我卖出的
	 * @apiName getSellList
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 我卖出的
	 * 
	 * @apiParam {int} status
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
	 * @apiSuccess {String} tags.gmtCreated
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *   "code": "200",
     *  "message": "",
     *  "pageNo": 1,
     *  "pageSize": 20,
     *  "pageCount": 0,
     *  "recordCount": 0,
     *  "tags": []
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void getSellList();
	
    /**
	 * @api {GET} /secondary/purchaseList  我买入的
	 * @apiName getPurchase
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 我买入的
	 * 
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {object} items
	 * @apiSuccess {Long} items.id
	 * @apiSuccess {Long} items.userId 用户id
	 * @apiSuccess {int} items.views 姓名
	 * @apiSuccess {int} items.goodsNum 电话 
	 * @apiSuccess {String} items.userName 名字
	 * @apiSuccess {String} items.headImgUrl
	 * @apiSuccess {String} items.goodsTitle 商品标题
	 * @apiSuccess {String} items.goodsContent 商品内容
	 * @apiSuccess {String} items.goodsImg 商品图片
	 * @apiSuccess {String} items.postion
	 * @apiSuccess {String} items.goodsType 商品类型
	 * @apiSuccess {String} items.goodsWay 售卖形式
	 * @apiSuccess {String} items.tradingWay 交易方式
	 * @apiSuccess {String} items.price 商品价格
	 * @apiSuccess {String} items.oldPrice 原价
	 * @apiSuccess {String} items.gmtCreated
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *   "code": "200",
     *  "message": "没有更多了",
     *  "pageNo": 1,
     *  "pageSize": 20,
     *   "pageCount": 0,
     *   "recordCount": 0,
     *  "items": []
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void getPurchase();
	
    /**
	 * @api {POST} /secondary/collection  收藏商品
	 * @apiName collection
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 收藏商品
	 * 
	 * @apiParam {Long} goodsId 商品id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
     *{
     *	"code": "200",
     *	"message": "想要成功"
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void collection();
	
    /**
	 * @api {GET} /secondary/collectionList  收藏的商品列表
	 * @apiName collectionList
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 收藏的商品列表
	 * 
	 * @apiParam {int} status
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} pageNo 当前页
	 * @apiSuccess {int} pageSize 页面大小
	 * @apiSuccess {int} pageCount总页数
	 * @apiSuccess {int} recordCount总记录数
	 * @apiSuccess {object} items
	 * @apiSuccess {Long} items.id
	 * @apiSuccess {Long} items.userId 用户id
	 * @apiSuccess {int} items.views 姓名
	 * @apiSuccess {int} items.goodsNum 电话 
	 * @apiSuccess {String} items.userName 名字
	 * @apiSuccess {String} items.headImgUrl
	 * @apiSuccess {String} items.goodsTitle 商品标题
	 * @apiSuccess {String} items.goodsContent 商品内容
	 * @apiSuccess {String} items.goodsImg 商品图片
	 * @apiSuccess {String} items.postion
	 * @apiSuccess {String} items.goodsType 商品类型
	 * @apiSuccess {String} items.goodsWay 售卖形式
	 * @apiSuccess {String} items.tradingWay 交易方式
	 * @apiSuccess {String} items.price 商品价格
	 * @apiSuccess {String} items.oldPrice 原价
	 * @apiSuccess {String} items.gmtCreated
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "没有更多了",
	 *   "pageNo": 1,
	 *   "pageSize": 20,
	 *   "pageCount": 0,
	 *   "recordCount": 0,
	 *   "items": []
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void collectionList();
	
    /**
	 * @api {GET} /secondary/isCollection  是否收藏
	 * @apiName isCollection
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 是否收藏
	 * 
	 * @apiParam {Long} goodsId 商品id
	 * @apiParam {int} pageNo  当前页
	 * @apiParam {int} pageSize  页面大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "未想要"
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void isCollection();
	
    /**
	 * @api {GET} /secondary/quantity  收藏数量
	 * @apiName collectionNum
	 * @apiGroup secondary
	 * @apiVersion 0.0.1
	 * @apiDescription 收藏数量
	 * 
	 * @apiParam {Long} goodsId 商品id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} quantity 数量
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "",
	 *    "quantity": 2
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":"400",
	 *     "message":""
	 * }
	 * 
	 */
	void collectionNum();
	
	  /**
		 * @api {GET} /secondary/violationMessage/{id}  获取审核未通过信息
		 * @apiName getSecondaryMessage
		 * @apiGroup secondary
		 * @apiVersion 0.0.1
		 * @apiDescription 获取审核未通过信息
		 * 
		 * @apiParam {Long} id 用户id
		 * 
		 * @apiSuccess {String} code 结果码
		 * @apiSuccess {String} message 消息说明
		 * @apiSuccess {object} list 
		 * @apiSuccess {int} list.id 
		 * @apiSuccess {String} list.goodsTitle 商品标题
		 * @apiSuccess {String} list.title 信息标题
		 * @apiSuccess {String} list.isView 是否被看过
		 * @apiSuccess {String} list.message 信息内容
		 * @apiSuccess {String} list.gmtCreated 时间
		 * @apiSuccessExample Success-Response:
		 * HTTP/1.1 200
		 *{
		 *    "code": "200",
		 *    "message": "",
		 *    "list": [
		 *        {
		 *            "id": 1,
		 *            "goodsTitle": "黑蛇黑寡妇蜘蛛X 经济版87键 悬浮式机械键盘。（雷蛇）黑蛇黑寡妇蜘蛛X 经济版87键 悬浮式机械键盘。（雷蛇）",
		 *            "title": "审核未通过",
		 *            "isView": "0",
		 *            "message": "内容违规",
		 *            "gmtCreated": "2018-12-21 14:50:29"
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
	void getSecondaryMessage();
	

	  /**
		 * @api {post} /secondary/commentMessage/delete  消息中心删除评论回复提醒消息
		 * @apiName updateSecondaryCommentsNoSee
		 * @apiGroup secondary
		 * @apiVersion 0.0.1
		 * @apiDescription 消息中心删除评论回复提醒消息
		 * 
		 * @apiParam {Long} id 消息id
		 * 
		 * @apiSuccess {String} code 结果码
		 * @apiSuccess {String} message 消息说明
		 * @apiSuccessExample Success-Response:
		 * HTTP/1.1 200
		 *{
		 *    "code": "200",
		 *    "message": ""
		 *}
		 * @apiErrorExample Error-Response:
		 * HTTP/1.1 400
		 * {
		 *     "code":"400",
		 *     "message":""
		 * }
		 * 
		 */
	void updateSecondaryCommentsNoSee();
	  /**
		* @api {post} /secondary/violationMessage/delete/{id}   消息中心删除评审核提醒消息
		* @apiName updateSecondaryMessageNoSee
		* @apiGroup secondary
		* @apiVersion 0.0.1
		* @apiDescription  消息中心删除评审核提醒消息
		* 
		* @apiParam {Long} id 消息id
		* 
		* @apiSuccess {String} code 结果码
		* @apiSuccess {String} message 消息说明
		* @apiSuccessExample Success-Response:
		* HTTP/1.1 200
	    *{
		*    "code": "200",
		*    "message": ""
		*}
		* @apiErrorExample Error-Response:
		* HTTP/1.1 400
		* {
		*     "code":"400",
		*     "message":""
		* }
		* 
		*/	
	void updateSecondaryMessageNoSee();
	  /**
		 * @api {GET} /secondary/violationDetail/{id}  查看审核详细信息
		 * @apiName getSecondaryMessageDetail
		 * @apiGroup secondary
		 * @apiVersion 0.0.1
		 * @apiDescription 查看审核详细信息
		 * 
		 * @apiParam {Long} id 用户id
		 * 
		 * @apiSuccess {String} code 结果码
		 * @apiSuccess {String} message 消息说明
		 * @apiSuccess {int} id 
		 * @apiSuccess {String} goodsTitle 商品标题
		 * @apiSuccess {String} title 信息标题
		 * @apiSuccess {String} isView 是否被看过
		 * @apiSuccess {String} message 信息内容
		 * @apiSuccess {String} gmtCreated 时间
		 * @apiSuccessExample Success-Response:
		 * HTTP/1.1 200
		 *{
		 *    "code": "200",
		 *    "message": "",
		 *    "id": 1,
		 *    "goodsTitle": "黑蛇黑寡妇蜘蛛X 经济版87键 悬浮式机械键盘。（雷蛇）黑蛇黑寡妇蜘蛛X 经济版87键 悬浮式机械键盘。（雷蛇）",
		 *    "title": "审核未通过",
		 *    "isView": "0",
		 *    "message": "内容违规",
		 *    "gmtCreated": "2018-12-21 14:50:29"
		 * 
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
	void getSecondaryMessageDetail();
	
	
}
