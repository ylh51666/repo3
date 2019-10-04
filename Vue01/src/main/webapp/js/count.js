new Vue({
    el:"#app",
    data:{
        list:[]
    },
    methods:{
        getAll:function(){
            var _this = this;
            axios.post('getAll')
                .then(function(res){
                    console.log(res);
                    console.log(res.data);
                    _this.list = res.data;
                })
                .catch(function(err){

                });
        }
    },
    created:function () {
        this.getAll();
    }
})