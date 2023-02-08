<template>
  <div>
    <p>{{ msg }}</p>
    <hr>
    <LessonOne/>
    <hr>
    <LessonTwo/>
    <hr>
    <LessonThree/>
    <hr>
    <LessonSix/>
    <hr>
    <LessonSeven/>
    <hr>
    <div>
      <p>months: <input type="text" v-model="month" placeholder="enter months"></p>
    </div>
    <hr>
    <LessonEight/>
  </div>
  <!-- <img alt="Vue logo" src="./assets/logo.png"> -->
  <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'
import LessonOne from './components/LessonOne.vue';
import LessonTwo from './components/LessonTwo.vue';
import LessonThree from './components/LessonThree.vue';
import LessonSix from './components/LessonSix.vue';
import LessonSeven from './LessonSeven.vue';
import LessonEight from './components/LessonEight.vue';

export default {
  name: 'App',
  data() {
    return {
      msg: "hi hi hi",
      web:['web1','web2','web3','web4'],
      month: "",
    }
  },
  components: {
    LessonOne,
    LessonTwo,
    LessonThree,
    LessonSix,
    LessonSeven,
    LessonEight,
  },
  beforeUpdate() {
    if(this.month == 1){
      alert('too short');
      this.month = 3;
    }
  },
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  margin: 20px;
}
</style>
