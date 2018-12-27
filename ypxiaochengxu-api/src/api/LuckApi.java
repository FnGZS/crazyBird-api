package api;

/**
*
* @Type LuckApi.java
* @Desc 元培小程序接口文档_抽奖模块
* @author wangbiao
* @date 2018年12月23日19:16:00
* @Version V1.0
*/
@Deprecated
public interface LuckApi {

	/**
	 * @api {get} /luck/luckList 获取抽奖列表信息
	 * @apiName getLuckList
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 获取抽奖列表信息
	 * 
	 * @apiParam {Integer} status  状态1.开始开奖2结束
	 * @apiParam {Integer} orderByType  排序规则
	 * @apiParam {Integer} pageNo  当前页
	 * @apiParam {Integer} pageSize   分页大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Integer} pageNo 当前页
	 * @apiSuccess {Integer} pageSize 分页大小
	 * @apiSuccess {Integer} pageCount 总页数
	 * @apiSuccess {Integer} recordCount 总记录数
	 * @apiSuccess {object} items 列表
	 * @apiSuccess {Long} items.id id
	 * @apiSuccess {Long} items.userId 发起人id
	 * @apiSuccess {String} items.luckName 抽奖活动名字
	 * @apiSuccess {String} items.luckPic 抽奖活动图片
	 * @apiSuccess {String} items.explain 说明
	 * @apiSuccess {String} items.lotteryTime 开奖时间
	 * @apiSuccess {Integer} items.status 状态1.开始开奖2结束
	 * @apiSuccess {Integer} items.mode 方法1.按时间2.手动
	 * @apiSuccess {String} items.gmtCreated 发布时间 
	 * @apiSuccess {String} items.userName
	 * @apiSuccess {String} items.headImgUrl
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": null,
	 *    "pageNo": 1,
	 *    "pageSize": 20,
	 *    "pageCount": 1,
	 *    "recordCount": 5,
	 *    "items": [
	 *        {
	 *            "id": 2,
	 *            "userId": 413150235,
	 *            "luckName": "抽奖测试",
	 *            "luckPic": "https://www.lzywzb.com/attachment/images/819/2018/07/ahn7miI4M1QDEqEl1EnCenn0CnEiNh.png",
	 *            "explain": "抽奖测试",
	 *           "lotteryTime": "2018-12-22 13:18",
	 *            "status": 1,
	 *            "mode": 2,
	 *            "gmtCreated": "2018-12-22 23:05:57",
	 *            "userName": "Zhao、JW🐬",
	 *            "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/IsQaADpVic2dp2icVwMfFByQrxwulcNdFYU2iaibYoJibCHAFayISjm6Hl74rUxMVdl0PdQhOeziaKptUZSB0yINhaVw/132",
	 *            "items": [
	 *                {
	 *                    "id": 2,
	 *                    "luckPrize": "电竞鼠标垫",
	 *                    "num": "1",
	 *                    "luckPic": "https://www.lzywzb.c",
	 *                    "luckDrawId": 2,
	 *                    "sponsor": "",
	 *                    "gmtCreated": 1545491259000
	 *                },
	 *                {
	 *                    "id": 3,
	 *                    "luckPrize": "手机iphonex9",
	 *                    "num": "1",
	 *                    "luckPic": "https://paimgcdn.bai",
	 *                    "luckDrawId": 2,
	 *                    "sponsor": "",
	 *                    "gmtCreated": 1545491395000
	 *                }
	 *            ]
	 *        },
	 *        {
	 *            "id": 1,
	 *            "userId": 413150235,
	 *            "luckName": "1231",
	 *            "luckPic": "https://www.lzywzb.com/attachment/images/819/2018/07/ahn7miI4M1QDEqEl1EnCenn0CnEiNh.png",
	 *            "explain": "21421412423",
	 *            "lotteryTime": "2018.12.12",
	 *            "status": 1,
	 *            "mode": 2,
	 *            "gmtCreated": "2018-12-22 13:18:05",
	 *            "userName": "Zhao、JW🐬",
	 *            "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/IsQaADpVic2dp2icVwMfFByQrxwulcNdFYU2iaibYoJibCHAFayISjm6Hl74rUxMVdl0PdQhOeziaKptUZSB0yINhaVw/132",
	 *            "items": [
	 *                {
	 *                   "id": 1,
	 *                    "luckPrize": "娃娃",
	 *                    "num": "1",
	 *                    "luckPic": "http://img",
	 *                    "luckDrawId": 1,
	 *                    "sponsor": "",
	 *                    "gmtCreated": 1545461895000
	 *                },
	 *                {
	 *                    "id": 8,
	 *                    "luckPrize": "电脑一台",
	 *                    "num": "1",
	 *                    "luckPic": "https://img13.360buyimg.com/n2/jfs/t20098/264/1099452523/86683/adefec1b/5b13bcf0Nb10a9f8a.jpg!q90.jpg",
	 *                    "luckDrawId": 1,
	 *                    "sponsor": "疯鸟",
	 *                    "gmtCreated": 1545560215000
	 *                }
	 *            ]
	 *        }
	 *    ]
	 *}  
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getLuckList();

	/**
	 * @api {get} /luck/luckWinner 获取中奖者名单
	 * @apiName getLuckWinners
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 获取中奖者名单
	 * 
	 * @apiParam {Long} status  状态1.开始开奖2结束
	 * @apiParam {Long} luckId
	 * @apiParam {Integer} orderByType  排序规则
	 * @apiParam {Integer} pageNo  当前页
	 * @apiParam {Integer} pageSize   分页大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Integer} pageNo 当前页
	 * @apiSuccess {Integer} pageSize 分页大小
	 * @apiSuccess {Integer} pageCount 总页数
	 * @apiSuccess {Integer} recordCount 总记录数
	 * @apiSuccess {object} items 列表
	 * @apiSuccess {Long} items.id id
	 * @apiSuccess {Long} items.userId 用户id
	 * @apiSuccess {Long} items.luckId 抽奖活动id
	 * @apiSuccess {Integer} items.iswinning 是否中奖
	 * @apiSuccess {Long} items.priceId 奖品id
	 * @apiSuccess {String} items.luckPrize 抽奖活动名字
	 * @apiSuccess {String} items.num
	 * @apiSuccess {String} items.luckPic 抽奖活动图片
	 * @apiSuccess {String} items.userName
	 * @apiSuccess {String} items.headImgUrl
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": null,
	 *   "pageNo": 1,
	 *   "pageSize": 20,
	 *   "pageCount": 1,
	 *   "recordCount": 1,
	 *   "items": [
	 *       {
	 *           "id": 1,
	 *           "userId": 413150235,
	 *           "luckId": 1,
	 *           "iswinning": 1,
	 *           "priceId": 1,
	 *           "luckPrize": "娃娃",
	 *           "num": "1",
	 *           "luckPic": "http://img",
	 *           "userName": "Zhao、JW",
	 *           "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/IsQaADpVic2dp2icVwMfFByQrxwulcNdFYU2iaibYoJibCHAFayISjm6Hl74rUxMVdl0PdQhOeziaKptUZSB0yINhaVw/132"
	 *       }
	 *   ]
	 *} 
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getLuckWinners();

	/**
	 * @api {get} /luck/luckPartake 获取参与者名单
	 * @apiName getLuckPartake
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 获取参与者名单
	 * 
	 * @apiParam {Long} luckId 抽奖活动id
	 * @apiParam {Integer} orderByType  排序规则
	 * @apiParam {Integer} pageNo  当前页
	 * @apiParam {Integer} pageSize   分页大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Integer} pageNo 当前页
	 * @apiSuccess {Integer} pageSize 分页大小
	 * @apiSuccess {Integer} pageCount 总页数
	 * @apiSuccess {Integer} recordCount 总记录数
	 * @apiSuccess {object} items 列表
	 * @apiSuccess {Long} items.id id
	 * @apiSuccess {Long} items.userId 用户id
	 * @apiSuccess {Long} items.luckId 抽奖活动id
	 * @apiSuccess {Integer} items.iswinning 是否中奖
	 * @apiSuccess {String} items.userName
	 * @apiSuccess {String} items.headImgUrl
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 * {
	 *	 "code": "200",
	 *   "message": null,
	 *   "pageNo": 1,
	 *   "pageSize": 20,
	 *   "pageCount": 1,
	 *   "recordCount": 2,
	 *   "items": [
	 *       {
	 *           "id": 1,
	 *           "userId": 413150235,
	 *           "luckId": 1,
	 *           "isWinning": 1,
	 *           "userName": "Zhao、JW",
	 *           "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/IsQaADpVic2dp2icVwMfFByQrxwulcNdFYU2iaibYoJibCHAFayISjm6Hl74rUxMVdl0PdQhOeziaKptUZSB0yINhaVw/132"
	 *       }
	 *   ]
	 * } 
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getLuckPartake();

	/**
	 * @api {get} /luck/luckDetails 获取抽奖详情
	 * @apiName getLuckDetails
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 获取抽奖详情
	 * 
	 * @apiParam {Long} luckId 抽奖活动id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Long} id id
	 * @apiSuccess {Long} userId 发起人id
	 * @apiSuccess {String} luckName 抽奖活动名字
	 * @apiSuccess {String} luckPic 抽奖活动图片
	 * @apiSuccess {String} explain 说明
	 * @apiSuccess {String} lotteryTime 开奖时间
	 * @apiSuccess {String} prizeExplain 奖品介绍
	 * @apiSuccess {Integer} items.status 状态1.开始开奖2结束
	 * @apiSuccess {Integer} mode 方法1.按时间2.手动
	 * @apiSuccess {String} gmtCreated 发布时间 
	 * @apiSuccess {String} userName
	 * @apiSuccess {String} headImgUrl
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "",
	 *   "id": 1,
	 *   "userId": 413150235,
	 *   "luckName": "1231",
	 *   "luckPic": "https://www.lzywzb.com/attachment/images/819/2018/07/ahn7miI4M1QDEqEl1EnCenn0CnEiNh.png",
	 *   "explain": "21421412423",
	 *   "lotteryTime": "2018.12.12",
	 *   "prizeExplain": "",
	 *   "status": 1,
	 *   "mode": 2,
	 *   "gmtCreated": "2018-12-22 13:18:05",
	 *   "userName": "",
	 *   "headImgUrl": "",
	 *   "items": [
	 *       {
	 *           "id": 1,
	 *           "luckPrize": "娃娃",
	 *           "num": "1",
	 *           "luckPic": "http://img",
	 *           "luckDrawId": 1,
	 *           "sponsor": "",
	 *           "gmtCreated": 1545461895000
	 *       },
	 *       {
	 *           "id": 8,
	 *           "luckPrize": "电脑一台",
	 *           "num": "1",
	 *           "luckPic": "https://img13.360buyimg.com/n2/jfs/t20098/264/1099452523/86683/adefec1b/5b13bcf0Nb10a9f8a.jpg!q90.jpg",
	 *           "luckDrawId": 1,
	 *           "sponsor": "疯鸟",
	 *           "gmtCreated": 1545560215000
	 *       }
	 *   ]
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getLuckDetails();

	/**
	 * @api {post} /luck/isPart 是否已参加
	 * @apiName getIsPart
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 是否已参加
	 * 
	 * @apiParam {Long} luckId 抽奖活动id
	 * @apiParam {Long} userId 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "已参与"
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getIsPart();

	/**
	 * @api {post} /luck/addPrize 添加奖品
	 * @apiName AddPrize
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 添加奖品
	 * 
	 * @apiParam {String} luckPrize 奖品物品
	 * @apiParam {String} num 奖品数量
	 * @apiParam {Long} luckDrawId 抽奖id
	 * @apiParam {String} luckPic 奖品图片
	 * @apiParam {String} sponsor 赞助商
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "添加成功"
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void AddPrize();

	/**
	 * @api {post} /luck/addLuck 添加抽奖
	 * @apiName AddLuck
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 添加抽奖
	 * 
	 * @apiParam {Long} userId 发起人id
	 * @apiParam {String} luckName 抽奖活动名字
	 * @apiParam {String} luckPic 抽奖活动图片
	 * @apiParam {String} luckExplain 说明
	 * @apiParam {String} lotteryTime 开奖时间
	 * @apiParam {String} luckPrizeExplain 奖品介绍
	 * @apiParam {Integer} luckMode 方法1.按时间2.手动
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "添加成功"
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void AddLuck();

	/**
	 * @api {get} /luck/advertisement 广告
	 * @apiName Advertisement
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 广告
	 * 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} items 列表
	 * @apiSuccess {Long} items.id id
	 * @apiSuccess {String} items.pic 抽奖活动图片
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "",
	 *   "items": [
	 *       {
	 *           "id": 1,
	 *           "pic": "https://www.lzywzb.com/attachment/images/819/2018/06/d62BpINh8o1i6Q1iqzCc286iiisi6k.png"
	 *       },
	 *       {
	 *           "id": 2,
	 *           "pic": "https://www.lzywzb.com/attachment/images/819/2018/08/ke5z2ySMkls7szkLk7s7QkmCyUsZcE.jpg"
	 *       },
	 *       {
	 *           "id": 3,
	 *           "pic": "https://www.lzywzb.com/attachment/images/819/2018/07/ahn7miI4M1QDEqEl1EnCenn0CnEiNh.png"
	 *       },
	 *       {
	 *           "id": 4,
	 *           "pic": "https://www.lzywzb.com/attachment/images/819/2018/07/bk7jZk6ejG1EUyY7nq1eJq6L9EEsYJ.png"
	 *       }
	 *   ]
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void Advertisement();
	
	/**
	 * @api {get} /luck/delease 我发布的抽奖
	 * @apiName delease
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 我发布的抽奖
	 * 
	 * @apiParam {Long} userId
	 * @apiParam {Integer} orderByType  排序规则
	 * @apiParam {Integer} pageNo  当前页
	 * @apiParam {Integer} pageSize   分页大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Integer} pageNo 当前页
	 * @apiSuccess {Integer} pageSize 分页大小
	 * @apiSuccess {Integer} pageCount 总页数
	 * @apiSuccess {Integer} recordCount 总记录数
	 * @apiSuccess {object} items 列表
	 * @apiSuccess {Long} items.id id
	 * @apiSuccess {Long} items.userId 发起人id
	 * @apiSuccess {String} items.luckName 抽奖活动名字
	 * @apiSuccess {String} items.luckPic 抽奖活动图片
	 * @apiSuccess {String} items.explain 说明
	 * @apiSuccess {String} items.lotteryTime 开奖时间
	 * @apiSuccess {Integer} items.status 状态1.开始开奖2结束
	 * @apiSuccess {Integer} items.mode 方法1.按时间2.手动
	 * @apiSuccess {String} items.gmtCreated 发布时间 
	 * @apiSuccess {String} items.userName
	 * @apiSuccess {String} items.headImgUrl
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "",
	 *   "items": [
	 *       {
	 *           "id": 1,
	 *           "pic": "https://www.lzywzb.com/attachment/images/819/2018/06/d62BpINh8o1i6Q1iqzCc286iiisi6k.png"
	 *       },
	 *       {
	 *           "id": 2,
	 *           "pic": "https://www.lzywzb.com/attachment/images/819/2018/08/ke5z2ySMkls7szkLk7s7QkmCyUsZcE.jpg"
	 *       },
	 *       {
	 *           "id": 3,
	 *           "pic": "https://www.lzywzb.com/attachment/images/819/2018/07/ahn7miI4M1QDEqEl1EnCenn0CnEiNh.png"
	 *       },
	 *       {
	 *           "id": 4,
	 *           "pic": "https://www.lzywzb.com/attachment/images/819/2018/07/bk7jZk6ejG1EUyY7nq1eJq6L9EEsYJ.png"
	 *       }
	 *   ]
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void delease();
	
	/**
	 * @api {get} /luck/joinList 我参与的抽奖
	 * @apiName getJoinList
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 我参与的抽奖
	 * 
	 * @apiParam {Long} userId
	 * @apiParam {Integer} orderByType  排序规则
	 * @apiParam {Integer} pageNo  当前页
	 * @apiParam {Integer} pageSize   分页大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Integer} pageNo 当前页
	 * @apiSuccess {Integer} pageSize 分页大小
	 * @apiSuccess {Integer} pageCount 总页数
	 * @apiSuccess {Integer} recordCount 总记录数
	 * @apiSuccess {object} items 列表
	 * @apiSuccess {Long} items.id id
	 * @apiSuccess {Long} items.userId 发起人id
	 * @apiSuccess {String} items.luckName 抽奖活动名字
	 * @apiSuccess {String} items.luckPic 抽奖活动图片
	 * @apiSuccess {String} items.explain 说明
	 * @apiSuccess {String} items.lotteryTime 开奖时间
	 * @apiSuccess {Integer} items.status 状态1.开始开奖2结束
	 * @apiSuccess {Integer} items.mode 方法1.按时间2.手动
	 * @apiSuccess {String} items.gmtCreated 发布时间 
	 * @apiSuccess {String} items.userName
	 * @apiSuccess {String} items.headImgUrl
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": null,
	 *   "pageNo": 1,
	 *   "pageSize": 20,
	 *   "pageCount": 1,
	 *   "recordCount": 1,
	 *   "items": [
	 *       {
	 *           "id": 1,
	 *           "userId": 413150235,
	 *           "luckName": "1231",
	 *           "luckPic": "https://www.lzywzb.com/attachment/images/819/2018/07/ahn7miI4M1QDEqEl1EnCenn0CnEiNh.png",
	 *           "explain": "21421412423",
	 *           "lotteryTime": "2018.12.12",
	 *           "status": 1,
	 *           "mode": 2,
	 *           "gmtCreated": "2018-12-22 13:18:05",
	 *           "userName": "Zhao、JW🐬",
	 *           "headImgUrl": "https://wx.qlogo.cn/mmopen/vi_32/IsQaADpVic2dp2icVwMfFByQrxwulcNdFYU2iaibYoJibCHAFayISjm6Hl74rUxMVdl0PdQhOeziaKptUZSB0yINhaVw/132",
	 *           "items": [
	 *               {
	 *                   "id": 1,
	 *                   "luckPrize": "娃娃",
	 *                   "num": "1",
	 *                   "luckPic": "http://img",
	 *                   "luckDrawId": 1,
	 *                   "sponsor": "",
	 *                   "gmtCreated": 1545461895000
	 *               },
	 *               {
	 *                   "id": 8,
	 *                   "luckPrize": "电脑一台",
	 *                   "num": "1",
	 *                   "luckPic": "https://img13.360buyimg.com/n2/jfs/t20098/264/1099452523/86683/adefec1b/5b13bcf0Nb10a9f8a.jpg!q90.jpg",
	 *                   "luckDrawId": 1,
	 *                   "sponsor": "疯鸟",
	 *                   "gmtCreated": 1545560215000
	 *               }
	 *           ]
	 *       }
	 *   ]
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void getJoinList();
	
	/**
	 * @api {get} /luck/award 我中奖的记录
	 * @apiName awardList
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 我中奖的记录
	 * 
	 * @apiParam {Long} userId
	 * @apiParam {Integer} orderByType  排序规则
	 * @apiParam {Integer} pageNo  当前页
	 * @apiParam {Integer} pageSize   分页大小
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {Integer} pageNo 当前页
	 * @apiSuccess {Integer} pageSize 分页大小
	 * @apiSuccess {Integer} pageCount 总页数
	 * @apiSuccess {Integer} recordCount 总记录数
	 * @apiSuccess {object} items 列表
	 * @apiSuccess {Long} items.id id
	 * @apiSuccess {Long} items.userId 发起人id
	 * @apiSuccess {String} items.luckName 抽奖活动名字
	 * @apiSuccess {String} items.luckPic 抽奖活动图片
	 * @apiSuccess {String} items.explain 说明
	 * @apiSuccess {String} items.lotteryTime 开奖时间
	 * @apiSuccess {Integer} items.status 状态1.开始开奖2结束
	 * @apiSuccess {Integer} items.mode 方法1.按时间2.手动
	 * @apiSuccess {String} items.gmtCreated 发布时间 
	 * @apiSuccess {String} items.userName
	 * @apiSuccess {String} items.headImgUrl
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": null,
	 *   "pageNo": 1,
	 *   "pageSize": 20,
	 *   "pageCount": 1,
	 *   "recordCount": 1,
	 *   "items": [
	 *       {
	 *           "id": 1,
	 *           "luckPrize": "娃娃",
	 *           "num": "1",
	 *           "luckPic": "http://img",
	 *           "luckDrawId": 1,
	 *           "sponsor": "",
	 *           "gmtCreated": 1545461895000
	 *       }
	 *   ]
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void awardList();
	
	/**
	 * @api {get} /luck/contentByPrize 根据物品id查询抽奖详情
	 * @apiName contentByPrize
	 * @apiGroup luck
	 * @apiVersion 0.0.1
	 * @apiDescription 根据物品id查询抽奖详情
	 * 
	 * @apiParam {Long} prizeId
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} items 列表
	 * @apiSuccess {Long} id id
	 * @apiSuccess {Long} userId 发起人id
	 * @apiSuccess {String} luckName 抽奖活动名字
	 * @apiSuccess {String} luckPic 抽奖活动图片
	 * @apiSuccess {String} explain 说明
	 * @apiSuccess {String} lotteryTime 开奖时间
	 * @apiSuccess {Integer} status 状态1.开始开奖2结束
	 * @apiSuccess {Integer} mode 方法1.按时间2.手动
	 * @apiSuccess {String} gmtCreated 发布时间 
	 * @apiSuccess {String} userName
	 * @apiSuccess {String} headImgUrl
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *   "code": "200",
	 *   "message": "",
	 *   "id": 1,
	 *   "userId": 413150235,
	 *   "luckName": "1231",
	 *   "luckPic": "https://www.lzywzb.com/attachment/images/819/2018/07/ahn7miI4M1QDEqEl1EnCenn0CnEiNh.png",
	 *   "explain": "21421412423",
	 *   "lotteryTime": "2018.12.12",
	 *   "prizeExplain": "",
	 *   "status": 1,
	 *   "mode": 2,
	 *   "gmtCreated": "2018-12-22 13:18:05",
	 *   "userName": "",
	 *   "headImgUrl": "",
	 *   "items": [
	 *       {
	 *           "id": 1,
	 *           "luckPrize": "娃娃",
	 *           "num": "1",
	 *           "luckPic": "http://img",
	 *           "luckDrawId": 1,
	 *           "sponsor": "",
	 *           "gmtCreated": 1545461895000
	 *       },
	 *       {
	 *           "id": 8,
	 *           "luckPrize": "电脑一台",
	 *           "num": "1",
	 *           "luckPic": "https://img13.360buyimg.com/n2/jfs/t20098/264/1099452523/86683/adefec1b/5b13bcf0Nb10a9f8a.jpg!q90.jpg",
	 *           "luckDrawId": 1,
	 *           "sponsor": "疯鸟",
	 *           "gmtCreated": 1545560215000
	 *       }
	 *   ]
	 *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * 
	 * */
	void contentByPrize();
}
