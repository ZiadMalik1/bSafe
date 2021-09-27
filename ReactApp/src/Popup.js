
function Popup(prop){
    return (props.trigger) ? (
        <div class="popup">
            <div class="popup-inner">
                Are you sure you want to delete this tip?
                <div>
                    Once it is deleted it cannot be brought back!
                </div>
                <div class="yes-button">Yes</div>
                <div class="no-button">No</div>
            </div>
        </div>
        
    ) : "";
}