<template>
  <div>
    LessonTwo Test
    <h1>hmm</h1>
    <ul class="menu">
      <li>Menu1</li>
      <li>Menu2</li>
      <li>Menu3</li>
      <li>Menu4</li>
    </ul>
    <hr>
    <ul class="menu">
      <li>{{ Menu[0] }}</li>
      <li>{{ Menu[1] }}</li>
      <li>{{ Menu[2] }}</li>
      <li>{{ Menu[3] }}</li>
    </ul>
    <hr>
    <ul class="menu">
      <li v-for="i in 4" :key="i">{{ Menu }}</li>
    </ul>
    <hr>
    <ul class="menu">
      <li v-for="i in 4" :key="i">{{ i }}</li>
    </ul>
    <hr>
    <ul class="menu">
      <li v-for="i in Menu" :key="i">{{ i }}</li>
    </ul>
    <hr>
    <ul class="menu">
      <li v-for="i in Menu" :key="i">{{ Menu }}</li>
    </ul>
    <hr>
    <ul class="menu">
      <li v-for="(Menu,i) in Menu" :key="i">{{ i }}</li>
    </ul>
    <hr>
    <ul class="menu">
      <li v-for="(Menu,i) in Menu" :key="i">{{ Menu }}</li>
    </ul>
    <hr>
    <div class="box" v-for="(title,i) in title" :key="i">
      <h6>{{ title }}</h6>
    </div>
    <hr>
    <div class="box" v-for="(x,i) in title" :key="i">
      <h6>{{ title[i] }}</h6>
    </div>
    <hr>
    <ul class="menu">
      <li v-for="(Menu,i) in Menu" :key="i">{{ Menu[i] }}</li>
    </ul>
    <hr>
    <ul class="menu">
      <li v-for="(x,i) in Menu" :key="i">{{ Menu[i] }}</li>
    </ul>
    <hr>

  </div>
</template>

<script>
  export default {
    data() {
      return {
        hmm: 'hi',
        Menu: ['Menu1', 'Menu2', 'Menu3', 'Menu4'],
        title: ['title1', 'title2', 'title3'],
      }
    },
  }
</script>

<style>
  .menu {
    list-style: none;
    height: 30px;
    background-color: darksalmon;
    padding-top: 10px;
  }

  .menu li {
    float: left;
    margin: 0 20px;
  }

  .box {
    border: 1px solid green;
    width: 100px;
    height: 100px;
    text-align: center;
    font-size: 25px;
    float: left;
    margin: 10px;
    background-color: pink;
    border: none;
    font-style: oblique;
  }

  hr {
    clear: both;
  }
</style>