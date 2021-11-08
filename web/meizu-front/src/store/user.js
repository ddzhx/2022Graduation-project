const user = {
    state:{
        userId:"",  //用户id
        username:"", //用户名
        nouser:false, //判断用户是否登录
    },
    getters:{
        userId:state => {
            let userId = state.userId
            if(!userId){
                userId = JSON.parse(window.sessionStorage.getItem('userId'))
            }
            return userId
        },

        username:state => {
            let username = state.username
            if(!username){
                username = JSON.parse(window.sessionStorage.getItem('username'))
            }
            return username
        },

        nouser:state => {
            let nouser = state.nouser
            if(!nouser){
                nouser = JSON.parse(window.sessionStorage.getItem('nouser'))
            }
            return nouser
        }
    },

    mutations:{
        setUserId:(state,userId) => {
            state.userId = userId
            window.sessionStorage.setItem('userId',JSON.stringify(userId))
        },
        setUsername:(state,username) =>{
            state.username = username
            window.sessionStorage.setItem('username',JSON.stringify(username))
        },
        setnouser:(state,nouser) =>{
            state.nouser = nouser
            window.sessionStorage.setItem('nouser',JSON.stringify(nouser))
        }
    }
}


export default user