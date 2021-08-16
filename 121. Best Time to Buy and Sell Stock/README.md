Trick is to use 0 as cut-off, as anything below 0 is loss. So starting with 0 as max_diff, iterate. 
Cut and start a new iteration if loss occurs, or keep updating maximums. Finally return max.