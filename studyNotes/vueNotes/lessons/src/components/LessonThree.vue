<template>
  <div><!-- v-on:이벤트명/  @이벤트명 -->
    <p><button @click="num1++">클릭 </button><span> : {{num1}}</span></p>
    <p><button @click="num2+=2">클릭 </button><span> : {{num2}}</span></p>
    <hr>
    <p><button @click="plus()">클릭</button><span> : {{num3}}</span></p>
    <hr>
    <p>
        <button @click="clickAlert()">클릭!!!</button>
        <button @click="clickAlert">클릭!!!</button>
        <button v-on:click="clickAlert2">클릭!!!</button>
        <button @click="clickAlert2">클릭!!!</button>
    </p>

    <div class="bg" v-if="popup1==true">
        <div>
            <h4>제목</h4>
            <p>내용입니다.</p>
            <p>
                <button v-on:click="popup1=false">닫기</button>
                <button @click="close()">닫기</button>
            </p>
        </div>
    </div>
    <div>
        <p><button @click="popup1=true">팝업창1</button></p>
    </div>
   <hr>

    <transition name="fade"> 
        <!--  .name명-enter-from~to / .name명-leave-from~to  -->
        <div class="bg" v-if="popup2==true">
            <div>
                <h4>제목</h4>
                <p>내용입니다.</p>
                <p>
                    <button v-on:click="popup2=false">닫기</button>
                </p>
            </div>
        </div>
    </transition>
    <div>
        <p><button @click="popup2=true">팝업창2</button></p>
    </div>    


  </div>
</template>

<script>
export default {
    data() {
        return {
            num1 : 0,
            num2 : 0,
            num3 : 5,
            popup1 : false,
            popup2 : false,
        }
    },
    methods: {
        plus(){
            this.num3+=5
        },
        clickAlert(){
            alert('클릭했구나!!');
        },
        clickAlert2 : function(){
            alert('클릭했구나!!2222');
        },
        close(){
            this.popup1 = false
        }
    },
}
</script>

<style>

.bg{width:200px; height:200px; background-color: aqua; border-radius: 50%; text-align: center; position: fixed; left:50%; top:50%; transform: translate(-50%,-50%);}

.fade-enter-from{opacity: 0;}/*start효과*/ 
.fade-enter-active{ transition: all 1.5s;}
.fade-enter-to{opacity: 1;}

.fade-leave-from{opacity: 1;}/*end효과*/ 
.fade-leave-active{ transition: all 1.5s;}
.fade-leave-to{opacity: 0;}

</style>