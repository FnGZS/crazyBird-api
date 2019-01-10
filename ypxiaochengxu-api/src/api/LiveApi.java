package api;
@Deprecated
public interface LiveApi {
	/**
	 * @api {get} /live/getPlayUrl  得到播放地址列表
	 * @apiName getPlayUrl()
	 * @apiGroup live
	 * @apiVersion 0.0.1
	 * @apiDescription 得到播放地址列表
	 * 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} list
	 * @apiSuccess {int} list.id 
	 * @apiSuccess {String} list.title 消息说明
	 * @apiSuccess {int} list.status 地址状态 (0:关闭，1:开启) 
	 * @apiSuccess {String} list.playUrl 播放地址
	 * @apiSuccess {String} list.endTime 结束时间
	 * @apiSuccess {String} list.streamId 房间号
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "",
	 *    "list": [
	 *        {
	 *            "id": 1,
	 *            "title": "感恩晚会现场直播",
	 *            "status": 1,
	 *            "playUrl": "[\"http://abc.sxscott.com/live/741977480.m3u8\",\"http://abc.sxscott.com/live/741977480.fly\",\"rmtp://abc.sxscott.com/live/741977480\"",
	 *            "endTime": "2018-12-25 18:00:00",
	 *            "streamId": "741977480"
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
	void getPlayUrl() ;
	
	/**
	 * @api {get} /live/getPlayUrl/{id}  得到某个播放地址详情
	 * @apiName getPlayUrlDetail()
	 * @apiGroup live
	 * @apiVersion 0.0.1
	 * @apiDescription 得到某个播放地址详情
	 * 
	 * @apiParam {int} id
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {int} id 
	 * @apiSuccess {String} title 消息说明
	 * @apiSuccess {int} status 地址状态 (0:关闭，1:开启) 
	 * @apiSuccess {String} playUrl 播放地址
	 * @apiSuccess {String} endTime 结束时间
	 * @apiSuccess {String} streamId 房间号
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
     * "code": "200",
     * "message": "",
     * "id": 1,
     *"title": "感恩晚会现场直播",
     * "status": 1,
     * "playUrl": "[\"http://abc.sxscott.com/live/741977480.m3u8\",\"http://abc.sxscott.com/live/741977480.fly\",\"rmtp://abc.sxscott.com/live/741977480\"",
     * "endTime": "2018-12-25 18:00:00",
     * "streamId": "741977480"
     *}
	 * @apiErrorExample Error-Response:
	 * HTTP/1.1 400
	 * {
	 *     "code":400,
	 *     "message":""
	 * }
	 * */
	void getPlayUrlDetail(Long id) ;
	
	/**
	 * @api {get} /live/getGiftList  得到礼物列表
	 * @apiName getLiveGiftList()
	 * @apiGroup live
	 * @apiVersion 0.0.1
	 * @apiDescription 得到礼物列表
	 * 
	 * 
	 * @apiSuccess {String} code 结果码
	 * @apiSuccess {String} message 消息说明
	 * @apiSuccess {object} list 
	 * @apiSuccess {int} list.id 
	 * @apiSuccess {String}  list.giftName 礼物名称
	 * @apiSuccess {String} list.giftImage 礼物图片
	 * @apiSuccess {String} list.giftPrice 礼物价格
	 * @apiSuccessExample Success-Response:
	 * HTTP/1.1 200
	 *{
	 *    "code": "200",
	 *    "message": "",
	 *    "list": [
	 *        {
	 *            "id": 1,
	 *            "giftName": "鱼丸",
	 *            "giftImage": "xxxxx.jpg",
	 *            "giftPrice": "0.01"
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
	void getLiveGiftList();
	  /**
		 * @api {POST} /live/createGiftList  礼物下单
		 * @apiName createGiftOrder
		 * @apiGroup live
		 * @apiVersion 0.0.1
		 * @apiDescription 礼物下单
		 * 
		 * @apiParam {int} giftId  礼物Id
		 * @apiParam {double} totalPrice  价格
		 * @apiParam {int} liveId  直播间房间号
		 * @apiParam {int} giftNum  礼物数量
		 * @apiParam {String} platCode （重新获取code）
		 * @apiParam {double} fee  价格(跟totalPrice一样，数值类型即可，如：1.00)
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
	void createGiftOrder();
}
