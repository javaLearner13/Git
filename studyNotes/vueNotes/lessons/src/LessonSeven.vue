<template>
  <div id="routerwrap">
    <ul>
        <li><router-link to="/link1">link1</router-link></li>
        <li><router-link to="/link2">link2</router-link></li>
        <li><router-link to="/link3">link3</router-link></li>
    </ul>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
data() {
    return {
        
    }
},
}
</script>

<style>
    #routerwrap{height: 250px;}
    #routerwrap ul li a{text-decoration: none; color: red;}
    #routerwrap ul li a:hover{text-decoration: underline; color: blue;}
</style>