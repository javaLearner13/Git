<template>
<div>
  <p>{{ msg }}</p>
  <hr>
  <LessonOne/>
  <LessonOne/>
  <hr>
  <LessonTwo/>
  <hr>
  <LessonThree/> 
  <hr>
  <LessonFour/> 
  <hr>
  <div>
    <p>App.vue파일입니다.</p>
    <div>
      <p>{{web[0]}}</p> 
      <p>{{web[1]}}</p> 
      <p>{{web[2]}}</p> 
      <p>{{web[3]}}</p> 
    </div>
  </div>
  <hr>
  <LessonFive v-bind:web="web"/> 
  <LessonFive :web="web"/> 
  <hr>
  <LessonSix/>
  <hr>
  <LessonSeven/>    
  <hr>
  <div>
    <p>수강개월수 : <input type="text" v-model="month" placeholder="수강가능한 개월수 입력"></p>
  </div>
  <hr>
  <LessonEight/>
  <hr>
  <LessonNine/>
</div>
</template>

<script>
import LessonOne from './components/LessonOne.vue'
import LessonTwo from './components/LessonTwo.vue'
import LessonThree from './components/LessonThree.vue'
import LessonFour from './components/LessonFour.vue'
import LessonFive from './LessonFive.vue'
import LessonSix from './components/LessonSix.vue'
import LessonSeven from './LessonSeven.vue'
import LessonEight from './components/LessonEight.vue'
import LessonNine from './components/LessonNine.vue'

export default {
  name: 'App',
  data() {
    return {//{이름 : 값}
      msg : "안녕안녕!!!",
      web : ['web1','web2','web3','web4'],
      month : "",
    }
  },
  components: {
    LessonOne,
    LessonTwo,
    LessonThree,
    LessonFour,
    LessonFive,
    LessonSix,
    LessonSeven,
    LessonEight,
    LessonNine   
    },
    beforeUpdate() {//데이터가 업데이트되기 전에 실행
      if(this.month == 1){
        alert('너무 짧아요')
        this.month = 3
      }
    },


 }

</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  margin:20px;
}
</style>
