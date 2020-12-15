let mileage = 0;

    function randomMoney() {
        const randomMileage = (Math.floor(Math.random() * 100) + 1) *1000;
        mileage = randomMileage;
        document.querySelector("[name='Mileage'").value = mileage;
    }

    var patt = new RegExp("[0-9]{2,3}"-"[0-9]{3,4}"-"[0-9]{3,4}");

    $("#tlno").keyup(function(event){
        var inputVal = $(this).val();
        $(this).val(inputVal.replace(/[^0-9]/gi,''));
    });
   
   
        var oTbl;
        var i = 0;
        var count = 1;
            
        function insRow() {
            
        i++;
        count++;
            
        oTbl = document.getElementById("addTable");
        var oRow = oTbl.insertRow();
        oRow.onmouseover=function(){oTbl.clickedRowIndex=this.rowIndex};
            
        var oCell = oRow.insertCell();
        var frmTag = "<input type='text' name='addText["+i+"]'>";

        frmTag += "<input type=button value='삭제' onClick='removeRow()' style='cursor:hand'>";
        frmTag += "<input type='hidden' name='count' value='"+count+"'>";
        oCell.innerHTML = frmTag;
        }

        function removeRow() {
        oTbl.deleteRow(oTbl.clickedRowIndex);
        }