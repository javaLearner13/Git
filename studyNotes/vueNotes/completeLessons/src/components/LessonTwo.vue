<template>
  <div>
    <ul class="menu">
        <li>Menu1</li>
        <li>Menu2</li>
        <li>Menu3</li>
        <li>Menu4</li>
    </ul>
    <hr>
    <ul class="menu">
        <li>{{Menu[0]}}</li>
        <li>{{Menu[1]}}</li>
        <li>{{Menu[2]}}</li>
        <li>{{Menu[3]}}</li>
    </ul>
    <hr>   
     <ul class="menu">
        <li v-for="i in 4" :key="i">{{Menu}}</li>
    </ul>    
     <hr>   
     <ul class="menu">
        <li v-for="i in 4" :key="i">{{i}}</li>
    </ul>   
    <hr>   
     <ul class="menu">
        <li v-for="i in Menu" :key="i">{{i}}</li>
    </ul>   
    <hr>   
     <ul class="menu">
        <li v-for="i in Menu" :key="i">{{Menu}}</li>
    </ul>   
    <hr>   
     <ul class="menu">
        <li v-for="(Menu,i) in Menu" :key="i">{{i}}</li>
    </ul>    
      <hr>   
     <ul class="menu">
        <li v-for="(Menu,i) in Menu" :key="i">{{Menu}}</li>
    </ul>    
    <hr>
    <!-- div를 3개출력/ div안에 데이터는 각각 제목1/제목2/제목3(v-for) -->
    <div class="box" v-for="(title, i) in title" :key="i">
        <h6>{{i}}</h6>
    </div> 
    <div class="box" v-for="(title, i) in title" :key="i">
        <h6>{{title}}</h6>
    </div> 
    <div class="box" v-for="(title, i) in title" :key="i">
        <h6>{{title[i]}}</h6>
    </div> 
    <div class="box" v-for="(titles, i) in title" :key="i">
        <h6>{{title[i]}}</h6>
    </div> 
    <hr>
    <ul class="menu">
        <li v-for="(Menus,i) in Menu" :key="i">{{Menu[i]}}</li>
    </ul>     
  </div>
</template>

<script>
export default {
    data() {
        return {
            Menu : ['Menu1','Menu2','Menu3','Menu4'],
            title : ['제목1','제목2','제목3'],

        }
    },
}
</script>

<style>
.menu{list-style: none; height:30px; background-color: goldenrod; padding-top:10px;} 
.menu li{float: left; margin:0 20px;}

.box{border: 1px solid green; width:100px; height: 100px; text-align: center; font-size: 25px; float: left; margin:10px;}
hr{clear: both;}
</style>