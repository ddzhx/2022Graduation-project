<template>
<div class="slidebar">
    <!--表头搜索款-->
 <el-input
    placeholder="请输入内容"
    prefix-icon="el-icon-search"
    style="width: 20%"
    v-model="input2">
  </el-input>

   <!--掉头搜索选择器-->
     <el-select v-model="value" placeholder="请选择">
    <el-option
      v-for="item in options"
      :key="item.value"
      :label="item.label"
      :value="item.value">
    </el-option>
  </el-select>

  <!--表头添加按钮-->
   <el-button type="primary" icon="el-icon-circle-plus" circle @click="dialogFormVisible = true"></el-button>
   

    <el-dialog title="添加分类产品图" :visible.sync="dialogFormVisible">
  <el-form :model="form" ref="form" id="tf">
    <el-form-item label="轮产品名字" :label-width="formLabelWidth">
      <el-input v-model="form.productname" name="productname" autocomplete="off"></el-input>
    </el-form-item>
  
    <el-form-item label="图片" :label-width="formLabelWidth">
      <el-upload
       action="#"
       list-type="picture-card"
       :auto-upload="false">
      <i slot="default" class="el-icon-plus"></i>
      <div slot="file" slot-scope="{file}" >
      <img
        class="el-upload-list__item-thumbnail" name="file"
        :src="file.url" alt=""
      >
      </span>
    </div>
</el-upload>
<el-dialog :visible.sync="dialogVisible">
  <img width="100%" :src="dialogImageUrl" alt="">
</el-dialog>
    </el-form-item>
    
     <el-form-item label="产品类型" size="mini" >
                    <el-radio-group v-model="form.producttpye" name="producttpye">
                        <el-radio :label="0">推荐</el-radio>
                        <el-radio :label="1">手机</el-radio>
                        <el-radio :label="2">声学</el-radio>
                        <el-radio :label="3">配件</el-radio> 
                        <el-radio :label="4">生活</el-radio>
                        <el-radio :label="5">Lipro</el-radio>                           
                    </el-radio-group>
                </el-form-item>
    
    <el-form-item label="分类产品时间" :label-width="formLabelWidth">
      <el-date-picker
      name="productcreate"
      type="date"
      v-model="form.productcreate"
      placeholder="选择日期">
    </el-date-picker>
    </el-form-item>
    
  </el-form>
  <div slot="footer" class="dialog-footer">
    <el-button @click="dialogFormVisible = false">取 消</el-button>
    <el-button type="primary" @click="sshowedit">确 定</el-button>
  </div>
</el-dialog>

   <!--表-->
  <el-table
    ref="multipleTable"
    :data="tableData.slice((currentPage-1)*pageSize,currentPage*pageSize)"
    tooltip-effect="dark"
    style="width: 88%"
    @selection-change="handleSelectionChange">
    <el-table-column
      type="selection"
      width="55">
    </el-table-column>
    <el-table-column
      label="分类产品图"
      width="120">
      <template slot-scope="scope">
        <img :src="getUrl(scope.row.productpic)" style="width:100%"/>
      </template>
    </el-table-column>
    <el-table-column
      prop="productname"
      label="产品名"
      width="120">
    </el-table-column>
    <el-table-column
      label="类型"
      show-overflow-tooltip>
      <template slot-scope="scope">
      {{changeType(scope.row.producttpye)}}
      </template>
    </el-table-column>
    <el-table-column
      label="时间"
      show-overflow-tooltip>
      <template slot-scope="scope">
      {{attachdate(scope.row.productcreate)}}
      </template>
    </el-table-column>
     <el-table-column label="操作">
      <template slot-scope="scope">
        <el-button
          size="mini"
          type="danger"
          @click="handleDelete(scope.row.id)">删除</el-button>
      </template>
    </el-table-column>
  </el-table>

  <el-dialog title="删除歌手" :visible.sync="delVisible" width="300px" center>
            <div align="center">删除不可恢复，是否确定删除？</div>
            <span slot="footer">
                <el-button size="mini" @click="delVisible = false">取消</el-button>
                <el-button size="mini" @click="deleteRow">确定</el-button>                
            </span>
        </el-dialog>

  <!--分页功能-->
 <el-pagination
                background
                layout = "total,prev,pager,next"
                :current-page="currentPage"
                :page-size="pageSize"
                :total="tableData.length"
                @current-change="handleCurrentChange"
                >
            </el-pagination>
  </div>
</template>

<script>
import {getAllclassify,declassify} from '../api/index'
import { mixin } from '../mixins/index'
  export default {
     mixins: [mixin],
    data() {
      return {
        tableData: [],
        dialogFormVisible: false,
        form: {
          productname: '',
          productpic    : '',
          producttpye:'',
          productcreate: '',
        },
        formLabelWidth: '120px',
        multipleSelection: [],
        input2:'',
        dialogVisible: false,
        dialogImageUrl:'',
        currentPage:1, 
        pageSize:4,
        idx:-1,
        delVisible: false,
       tempData: [],
        options: [{
          value: '',
          label: ''
        },{
          value: '0',
          label: '推荐'
        },{
          value: '1',
          label: '手机'
        }, {
          value: '2',
          label: '声学'
        }, {
          value: '4',
          label: '生活'
        }, {
          value: '5',
          label: 'Lipro'
        }],
        value: ''
      }
    },

     watch:{
        //搜索框里面的内容发生变化的时候，搜索结果table列表的内容跟着它的内容发生变化
        input2: function(){
            if(this.input2 == ''){
                this.tableData = this.tempData
            }else{
                this.tableData = [];
                for(let item of this.tempData){
                    if(item.productname.includes(this.input2)){
                        this.tableData.push(item);
                    }
                }
            }
        },

        value:function(){
            if(this.value == ''){
                this.tableData = this.tempData
            }else{
                this.tableData = [];
                for(let item of this.tempData){
                    if(item.producttpye == this.value){
                        this.tableData.push(item);
                    }
                }

            }
        }
    },

  created(){
        this.getData()
    },
    methods: {
      handleSelectionChange(val) {
        this.multipleSelection = val;
      },
       //查询所有内容
        getData(){
          this.tempData = [];
            this.tableData = [];
            getAllclassify().then(res => {
                this.tempData = res;
                this.tableData = res;
            })
        },
      //添加分类商品
      sshowedit(){
          let _this = this
           let d = _this.form.productcreate;
           let producttpye = _this.form.producttpye;
           let datetime = d.getFullYear()+'-'+(d.getMonth()+1)+'-'+d.getDate();
          var form = new FormData(document.getElementById('tf')) 
          form.set("productcreate",datetime)
          form.set("producttpye",producttpye)
          var req = new XMLHttpRequest();
          req.onreadystatechange = function(){
            if(req.readyState == 4 && req.status == 200){
              let res =JSON.parse(req.response);
              if(res.code ==1){
                _this.getData();
                _this.form = {};
                 _this.$message({
                  message: '保存成功',
                  type: 'success'
                });       
              }else{
                 _this.$message({
                 message: '保存失败',
                 type: 'error'
        });
              }
            }
          }
          req.open('post',`${_this.$store.state.HOST}/classify/add`,false)
          req.send(form);
          this.dialogFormVisible = false;
        },
       //获取当前页
        handleCurrentChange(val){
            this.currentPage = val;
        },
        //删除商品分类
        deleteRow(){
          declassify(this.idx)
          .then(res=>{
            if(res){
              this.getData();       
              this.$message({
                  message: '保存成功',
                  type: 'success'
                });
            }else{
              this.$message({
                 message: '保存失败',
                 type: 'error'
        });
            }
          })
          .catch(err => {
                console.log(err);
            });
            this.delVisible = false;
        },
    }
  }
</script>

<style>
.slidebar{
    width: 88%;
}
</style>