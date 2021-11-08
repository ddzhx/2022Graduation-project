import { get,post } from "./http";

//查询所有轮播图内容
export const getAllSlideshow = () => get(`slideshow/allSlideshow`)

//删除轮播图
export const deSlideshow = (id) => get(`slideshow/delete?id=${id}`)

//查询首页产品
export const getAllhome = () => get(`home/allHome`)

//删除首页产品
export const dehome = (id) => get(`home/delete?id=${id}`)

//查询分类所有产品
export const getAllclassify = () => get(`classify/allClassify`)

//删除分类产品
export const declassify = (id) => get(`classify/delete?id=${id}`)

//查询发现
export const getAllFind = () => get(`find/allFind`)

//删除发现
export const defind = (id) => get(`find/delete?id=${id}`)

//查询详情页数据
export const getAllPddetails = () => get(`pddetails/allPddetails`)

//删除详情页数据
export const dedetails = (id) => get(`pddetails/delete?id=${id}`)

//查询用户
export const getalllogin = () => get(`/login/alllogin`)

//查询订单
export const getallform = () => get(`/form/allForm`)

//删除订单
export const deform = (id) => get(`/form/delete?id=${id}`)
