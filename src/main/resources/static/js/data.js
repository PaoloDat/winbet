function calc(name) {
    var cntWin=0, cntDraw=0, cntLose=0,
        cntFonPull=0, cntFonMiddle=0, cntFonUnpool=0,
        cntManPull=0, cntManMiddle=0, cntManUnpool=0;
    var context = $('.'+name);
    context.each(function () {
        var id = $(this).attr('id');
        var homeG = $("#"+id+"HG").text();
        var awayG = $("#"+id+"AG").text();
        var fonHome = $("#"+id+"FH").text();
        var fonDraw = $("#"+id+"FD").text();
        var fonAway = $("#"+id+"FA").text();
        var manHome = $("#"+id+"MH").text();
        var manDraw = $("#"+id+"MD").text();
        var manAway = $("#"+id+"MA").text();
        if (Number(homeG)>Number(awayG)) {
            cntWin++;
            context.find($("#"+id+"wdl"+name)).text(cntWin+"-"+cntDraw+"-"+cntLose);
            if ((fonHome>fonDraw)&&(fonHome>fonAway)) {
                cntFonPull++;
                context.find($("#"+id+"fon"+name)).text(cntFonPull+"-"+cntFonMiddle+"-"+cntFonUnpool);
            } else if ((fonHome<fonDraw)&&(fonHome<fonAway)) {
                cntFonUnpool++;
                context.find($("#"+id+"fon"+name)).text(cntFonPull+"-"+cntFonMiddle+"-"+cntFonUnpool);
            } else {
                cntFonMiddle++;
                context.find($("#"+id+"fon"+name)).text(cntFonPull+"-"+cntFonMiddle+"-"+cntFonUnpool);
            }
            if ((manHome>manAway)&&(manHome>manDraw)) {
                cntManPull++;
                context.find($("#"+id+"man"+name)).text(cntManPull+"-"+cntManMiddle+"-"+cntManUnpool);
            } else if ((manHome<manAway)&&(manHome<manDraw)) {
                cntManUnpool++;
                context.find($("#"+id+"man"+name)).text(cntManPull+"-"+cntManMiddle+"-"+cntManUnpool);
            } else {
                cntManMiddle++;
                context.find($("#"+id+"man"+name)).text(cntManPull+"-"+cntManMiddle+"-"+cntManUnpool);
            }
        } else {
            if (Number(homeG)<Number(awayG)) {
                cntLose++;
                context.find($("#"+id+"wdl"+name)).text(cntWin+"-"+cntDraw+"-"+cntLose);
                if ((fonAway>fonHome)&&(fonAway>fonDraw)) {
                    cntFonPull++;
                    context.find($("#"+id+"fon"+name)).text(cntFonPull+"-"+cntFonMiddle+"-"+cntFonUnpool);
                } else if ((fonAway<fonHome)&&(fonAway<fonDraw)) {
                    cntFonUnpool++;
                    context.find($("#"+id+"fon"+name)).text(cntFonPull+"-"+cntFonMiddle+"-"+cntFonUnpool);
                } else {
                    cntFonMiddle++;
                    context.find($("#"+id+"fon"+name)).text(cntFonPull+"-"+cntFonMiddle+"-"+cntFonUnpool);
                }
                if ((manAway>manHome)&&(manAway>manDraw)) {
                    cntManPull++;
                    context.find($("#"+id+"man"+name)).text(cntManPull+"-"+cntManMiddle+"-"+cntManUnpool);
                } else if ((manAway<manHome)&&(manAway<manDraw)) {
                    cntManUnpool++;
                    context.find($("#"+id+"man"+name)).text(cntManPull+"-"+cntManMiddle+"-"+cntManUnpool);
                } else {
                    cntManMiddle++;
                    context.find($("#"+id+"man"+name)).text(cntManPull+"-"+cntManMiddle+"-"+cntManUnpool);
                }
            } else {
                cntDraw++;
                context.find($("#"+id+"wdl"+name)).text(cntWin+"-"+cntDraw+"-"+cntLose);
                if ((fonDraw>fonHome)&&(fonDraw>fonAway)) {
                    cntFonPull++;
                    context.find($("#"+id+"fon"+name)).text(cntFonPull+"-"+cntFonMiddle+"-"+cntFonUnpool);
                } else if ((fonDraw<fonHome)&&(fonDraw<fonAway)) {
                    cntFonUnpool++;
                    context.find($("#"+id+"fon"+name)).text(cntFonPull+"-"+cntFonMiddle+"-"+cntFonUnpool);
                } else {
                    cntFonMiddle++;
                    context.find($("#"+id+"fon"+name)).text(cntFonPull+"-"+cntFonMiddle+"-"+cntFonUnpool);
                }
                if ((manDraw>manHome)&&(manDraw>manAway)) {
                    cntManPull++;
                    context.find($("#"+id+"man"+name)).text(cntManPull+"-"+cntManMiddle+"-"+cntManUnpool);
                } else if ((manDraw<manHome)&&(manDraw<manAway)) {
                    cntManUnpool++;
                    context.find($("#"+id+"man"+name)).text(cntManPull+"-"+cntManMiddle+"-"+cntManUnpool);
                } else {
                    cntManMiddle++;
                    context.find($("#"+id+"man"+name)).text(cntManPull+"-"+cntManMiddle+"-"+cntManUnpool);
                }
            }
        }
    }) // end of each
} // end of function calc()

$(document).ready(function () {
    calc('HomeTeamStat');
    calc('AwayTeamStat');
    calc('CompStat');
    calc('H2HStat');
    calc('FonExactMatch');
    calc('FonExactMatchComp');
    calc('ManExactValue');
    calc('ManExactValueForComp');
    calc('PullCompMismatch');
}) // end of document.ready