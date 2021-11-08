import { get,post } from "./http";

//登录
export const getLoginStatus = (params) =>post(`/add/login/status`,params)
//注册
export const setregister = (params) =>post(`/add/register`,params)
//轮播图
export const getslideshow = () =>get(`/slideshow/allSlideshow`)
//商品列表
export const getAllHome = () =>get(`/home/allHome`)
//商品列表分类
export const getAllClassify  = () => get(`classify/allClassify`)
//发现
export const getAllFind  = () => get(`find/allFind`)
//阅读量
export const updateRead = (params) => post(`find/update`,params);
//详情
export const getAllPddetails  = () => get(`pddetails/allPddetails`)
//添加购物车
export const getaddcart = (params) =>post(`/cart/add`,params)
//购物车
export const getallCart = () =>get(`/cart/allCart`)
//删除购物车商品
export const deCart = (id) =>get(`/cart/delete?id=${id}`)
//添加购物商品的数量
export const updatecart = (params) =>post(`/cart/update`,params)
//更改个人信息
export const updatelogin = (params) =>post(`/login/update`,params)
//个人信息的查询
export const getalllogin  = () => get(`/login/alllogin`)
//支付宝支付
export const pay  = (params) => post(`/pay/ddpay`,params)
//添加订单
export const setform  = (params) => post(`/form/add`,params)