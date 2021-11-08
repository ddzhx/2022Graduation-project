export const mixin = {
    methods:{
     //根据相对地址获取绝对地址
     getUrl(url){
        return `${this.$store.state.HOST}/${url}`
    },
    //获取数据库里的时间（yyyy-MM-dd）
    attachdate(val){
        return String(val).substr(0,10);
    },
     //弹出删除窗口
     handleDelete(id){
        this.idx = id;
        this.delVisible = true;
    },

    //获取类型
    changeType(value){
        if(value == 0){
            return '推荐';
        }
        if(value == 1){
            return '手机';
        }
        if(value == 2){
            return '声学';
        }
        if(value == 3){
            return '配件';
        }
        if(value == 4){
            return '生活';
        }
        if(value == 5){
            return 'Lipro';
        }
        return value;
    },
}
}