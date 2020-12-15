let mileage = 0;
      let number ="";

      function randomMoney() {
        const randomMileage = (Math.floor(Math.random() * 100) + 1) *1000;
        mileage = randomMileage.toLocaleString();
        mileage += "원";
        document.querySelector("[name='Mileage']").value = mileage;
      }

      function pushNum(n) {
        number += n;
        document.querySelector("[name='telNum']").value = number;
      }

      function deleteNum(){
        var slicestr = number.slice(0,-1);
        var result = slicestr;
        number = result;
        document.querySelector("[name='telNum']").value = number;
      }

      function resetValue() {
        number = "";
      }