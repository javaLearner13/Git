<template>
  <div>
    <!--  v-model -->
    <input type="text" v-model="message" placeholder="입력하세요">
    <p>메시지 : {{message}}</p>
    <hr>
    <p><span>여러줄 : </span></p>
    <p style="white-space:pre-line">{{message2}}</p>
    <br>
    <textarea cols="30" rows="10" v-model="message2" placeholder="입력하세요"></textarea>
    <hr>
    <input type="checkbox"  id="chk" v-model="checked">
    <label for="chk">{{checked}}</label>
    <hr>
    <div>
        <input type="checkbox" id="web1" value="web1" v-model="checkedName">
        <label for="web1">web1</label>
        <input type="checkbox" id="web2" value="web2" v-model="checkedName">
        <label for="web2">web2</label>
        <input type="checkbox" id="web3" value="web3" v-model="checkedName">
        <label for="web3">web3</label><br><br>
        <span>선택한 과목 : {{checkedName}}</span>
    </div> 
    <hr>
    <div>
        <input type="radio" id="one" value="web1" v-model="checkedName2">
        <label for="one">web1</label>
        <input type="radio" id="two" value="web2" v-model="checkedName2">
        <label for="web2">web2</label> <br><br>  
        <span>선택한 과목 : {{checkedName2}}</span>           
    </div>
    <hr>
    <select v-model="selected1">
        <option disabled value="">선택하세요</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
    </select>
    <span>선택 : {{selected1}}</span>
    <hr>
    <select v-model="selected2" multiple size="5">
        <option>web1</option>
        <option>web2</option>
        <option>web3</option>
        <option>web4</option>
        <option>web5</option>
    </select>
    <span>선택 : {{selected2}}</span>    

  </div>
</template>

<script>
export default {
    data() {
        return {
            message : "",
            message2 : "",
            checked:false,
            checkedName : [],
            checkedName2 : [],
            selected1: "",
            selected2: "",

        }
    },
}
</script>

<style>

</style>