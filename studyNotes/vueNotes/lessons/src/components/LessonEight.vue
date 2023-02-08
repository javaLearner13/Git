<template>
  <div>LessonEight.vue</div>
  <p><button id="ex1">click</button> : <span>output here</span></p>
  <p><button id="ex2">click</button></p>
  <div class="test">test</div>
  
</template>

<script>
import $ from 'jquery'
export default {
    mounted(){
        $('#ex1').on('click',() =>{
            alert('hello!');
            $('#ex1').next('span').text('greetings')
        })
        $('#ex2').on('click',()=>{
            $('.test').css({color:'red',backgroundColor:'yellow',width:'100px',height:'100px'})
        })
    },
}
</script>

<style>

</style>