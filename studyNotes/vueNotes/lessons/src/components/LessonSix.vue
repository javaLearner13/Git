<template>
  <div>
    <input type="text" v-model="message" placeholder="enter">
    <p>message: {{message}}</p>
    <hr>
    <p><span>multiple lines: </span></p>
    <p>{{message2}}</p>
    <br>
    <textarea name="" id="" cols="30" rows="10" v-model="message2" placeholder="please enter"></textarea>
    <hr>
    <input type="checkbox" id="chk" v-model="checked">
    <label for="chk">{{checked}}</label>
    <hr>
    <div>
        <input type="checkbox" id="web1" value="web1" v-model="checkedName">
        <label for="web1">web1</label>
        <input type="checkbox" id="web2" value="web2" v-model="checkedName">
        <label for="web2">web2</label>
        <input type="checkbox" id="web3" value="web3" v-model="checkedName">
        <label for="web3">web3</label>
        <span>subject you chose: {{checkedName}}</span>
        <input type="radio" id="one" value="web1" v-model="checkdName2">
        <label for="one">web1</label>
        <input type="radio" id="two" value="web2" v-model="checkdName2">
        <label for="two">web2</label>
        <span>subject you chose: {{checkedName2}}</span>
    </div>
    <hr>
    <select name="" id="" v-model="selected1">
      <option disabled value="">choose</option>
      <option value="">A</option>
      <option value="">B</option>
      <option value="">C</option>
    </select>
    <span>choice: {{selected1}}</span>
    <hr>
    <select name="" id="" v-model="selected2" multiple size="5">
      <option value="">web1</option>
      <option value="">web2</option>
      <option value="">web3</option>
      <option value="">web4</option>
      <option value="">web5</option>
    </select>
    <span>choice: {{selected2}}</span>
  </div>
</template>

<script>
export default {
    data() {
        return {
            message: "",
            message2: "",
            checked:false,
            checkedName: [],
            checkedName2: [],
            selected1: "",
            selected2: ""
        }
    },
}
</script>

<style>

</style>