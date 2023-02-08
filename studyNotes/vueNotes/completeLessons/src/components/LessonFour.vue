<template>
  <div>
    <div>
        <h4 :style="red">{{information[0].brand}}</h4>
        <p>{{information[0].contents}}</p>
        <p>{{information[0].price}}</p>
    </div>
    <div>
        <h4 :style="red">{{information[1].brand}}</h4>
        <p>{{information[1].contents}}</p>
        <p>{{information[1].price}}</p>
    </div>
    <div>
        <h4 :style="red">{{information[2].brand}}</h4>
        <p>{{information[2].contents}}</p>
        <p>{{information[2].price}}</p>
    </div>
    <hr>
    <div v-for="i in information" :key="i">
        <h4 :style="red">{{i.brand}}</h4>
        <p>{{i.contents}}</p>
        <p>{{i.price}}</p>
    </div>    
    <hr>
    <div v-for="(list,i) in information" :key="i">
        <h4 :style="red">{{information[i].brand}}</h4>
        <p>{{information[i].contents}}</p>
        <p>{{information[i].price}}</p>
    </div>     
    <hr>
    <div v-for="(list,i) in information" :key="i">
        <h4 :style="red">{{list.brand}}</h4>
        <p>{{list.contents}}</p>
        <p>{{list.price}}</p>
    </div>         


  </div>
</template>

<script>
import information from '../assets/information.js';  //js생략가능
export default {
    data() {
        return {
            information : information,
            red : 'color:red',
        }
    },
}
</script>

<style>

</style>