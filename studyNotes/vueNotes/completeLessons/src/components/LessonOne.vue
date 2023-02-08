<template>
  <div>
    <h1>인사 : {{Message}}</h1>
    <hr>
    <h2>{{id}}</h2>
    <h3>{{age}}</h3>
    <h2>{{id}}</h2>
    <h3>{{age}}</h3>
    <hr> 
    <p id="con1">뷰 수업입니다.1</p>   
    <p :style="con2">뷰 수업입니다.2</p> <!-- v-bind:속성명 -->  
    <p :style="con2">뷰 수업입니다.3</p>   
    <p v-bind:style="con2">뷰 수업입니다.4</p>   
    <ul>
       <li>{{contents[0]}}</li>
       <li>{{contents[1]}}</li>
       <li>{{contents[2]}}</li>
       <li>{{contents[3]}}</li>
    </ul>
    <ul>
        <li>name : {{contents2[0].name}} / num : {{contents2[0].num}}</li>
        <li>name : {{contents2[1].name}} / num : {{contents2[1].num}}</li>
        <li>name : {{contents2[2].name}} / num : {{contents2[2].num}}</li>
        <li>name : {{contents2[3].name}} / num : {{contents2[3].num}}</li>
    </ul>
  </div>
</template>

<script>
export default {
    data() {
        return {
            Message: 'Hello Vue.js',
            id : 'A0001',
            age:30,
            con2 : 'background-color:pink;color:red',
            contents : ['리스트1','리스트2','리스트3','리스트4'],
            contents2 : [
                { name : "ABC", num : 20},
                { name : "BBB", num : 22},
                { name : "CCC", num : 30},
                { name : "DDD", num : 40},
            ]
        }
    },
}
</script>

<style>
#con1{background-color: yellow; color:blue;}
</style>